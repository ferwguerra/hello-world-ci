FROM openjdk:8-jdk-alpine
WORKDIR /
ADD hello-0.0.1-SNAPSHOT.jar hello-0.0.1-SNAPSHOT.jar
EXPOSE 8080
CMD java - jar hello-0.0.1-SNAPSHOT.jar