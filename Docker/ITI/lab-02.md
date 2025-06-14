### P1: Docker Network Types
1. **Bridge**: Default network (private internal network)
2. **Host**: Removes network isolation between container and host
3. **None**: No networking (completely isolated)
4. **Overlay**: Connects multiple Docker daemons (Swarm)
5. **Macvlan**: Assigns MAC address to container (appears as physical device)
6. **IPVLAN**: Similar to Macvlan but uses same MAC address

### P2: Custom NGINX Image (without `FROM nginx`)
```Dockerfile
# Dockerfile
FROM alpine:latest
RUN apk add --no-cache nginx && \
    mkdir -p /run/nginx
COPY index.html /var/www/html/
EXPOSE 80
CMD ["nginx", "-g", "daemon off;"]
```
Build with:
```bash
docker build -t my-nginx .
```

### P3: Commit Container with File
```bash
# Run container and create file
docker run -it --name ubuntu1 ubuntu bash -c "touch /hello.txt && bash"

# In another terminal:
docker commit ubuntu1 ubuntu-with-file
docker stop ubuntu1
docker rm ubuntu1

# Test new image
docker run -it ubuntu-with-file ls /
```
**Answer**: y (file exists in new container)

### P4: Volume Persistence Test
```bash
# Create volume and container
docker volume create myvol
docker run -it -v myvol:/data --name vol-test ubuntu bash

# Inside container:
touch /data/vol-file.txt
exit

# Destroy container
docker rm vol-test

# Recreate and check
docker run -it -v myvol:/data ubuntu ls /data
```
**Result**: File persists after container removal

### P5: Custom Bridge Network
```bash
# Create network and containers
docker network create my-bridge

# Container 1
docker run -itd --name container1 --network my-bridge ubuntu bash -c "apt update && apt install -y iputils-ping && sleep infinity"

# Container 2
docker run -itd --name container2 --network my-bridge ubuntu bash -c "apt update && apt install -y iputils-ping && sleep infinity"

# Test connectivity
docker exec container1 ping container2
docker exec container2 ping container1
```
