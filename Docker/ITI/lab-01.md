### problem 1
### 1. Run the `hello-world` container
```bash
docker run hello-world
```
### 2. Check the container status
```bash
docker ps -a
```
### 3. Start the stopped container
```bash
docker start <container_id_or_name>
```

### 4. Remove the container
```bash
docker rm <container_id_or_name>
```
Replace `<container_id_or_name>` with the actual ID or name of your `hello-world` container.

### 5. Remove the image
```bash
docker rmi hello-world
```
---

### problem 2

### 1. Run an interactive Ubuntu container
```bash
docker run -it --name my-ubuntu ubuntu /bin/bash
```
This will:
- Download the Ubuntu image if not present
- Start a container named `my-ubuntu`
- Open an interactive bash shell (`-it` flags)

### 2. Run the command inside the container
```bash
echo docker
```

### 3. Create a file in the container's bash shell
```bash
touch hello-docker
```
Verify it exists:
```bash
ls
```

### 4. Exit the container (this stops it)
```bash
exit
```

### 5. Stop and remove the container
```bash
docker stop my-ubuntu
docker rm my-ubuntu
```

### Comment about the file `hello-docker`:
The file `hello-docker` was created inside the container's filesystem. When the container is removed, all files created inside it are permanently lost because containers are ephemeral by default. To persist data, you would need to use Docker volumes or bind mounts.

### 6. Remove all stopped containers
```bash
docker container prune
```
Or alternatively:
```bash
docker rm $(docker ps -aq)
```
---
### problem 3