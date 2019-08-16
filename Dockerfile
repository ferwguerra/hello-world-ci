FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY target/hello*.jar $CATALINA_HOME/app.jar
ENTRYPOINT ["java","-jar","/app.jar"]