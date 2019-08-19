# Install maven and compile project
FROM maven:3.5-jdk-8
COPY ./pom.xml ./pom.xml
RUN mvn dependency:go-offline -B
COPY ./src ./src
RUN mvn package


FROM openjdk:8-jdk-alpine
#VOLUME /tmp
EXPOSE 8080
#ARG JAR_FILE=target/hello-0.0.1-SNAPSHOT.jar
#ADD ${JAR_FILE} hello-world.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","target/hello-0.0.1-SNAPSHOT.jar"]
