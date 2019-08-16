FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY target/hello-0.0.1-SNAPSHOT.jar.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]