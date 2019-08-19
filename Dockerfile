# Install maven and compile project
FROM maven:3.5-jdk-8 as maven
COPY ./pom.xml ./pom.xml
RUN mvn dependency:go-offline -B
COPY ./src ./src
RUN mvn package


FROM openjdk:8-jdk-alpine

# set deployment directory
WORKDIR /hello-project
# copy over the built artifact from the maven image
COPY --from=maven target/hello-*.jar ./

EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","./target/hello-0.0.1-SNAPSHOT.jar"]
