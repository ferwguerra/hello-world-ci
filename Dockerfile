# Install maven and compile project
FROM maven:3.5-jdk-8 as maven
COPY . /app
WORKDIR /app
RUN mvn package


FROM openjdk:8-jdk-alpine
WORKDIR /app
# copy over the built artifact from the maven image
COPY --from=maven /app/target/hello-0.0.1-SNAPSHOT.jar hello-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","hello-0.0.1-SNAPSHOT.jar"]
