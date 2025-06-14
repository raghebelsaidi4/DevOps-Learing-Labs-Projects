FROM eclipse-temurin:17

LABEL mentainer="ragheb@gmail.com"

WORKDIR /app

COPY target/docker_demo-0.0.1-SNAPSHOT.jar /app/docker_demo.jar

ENTRYPOINT ["java", "-jar", "docker_demo.jar"]