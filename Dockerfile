FROM openjdk:11-slim
EXPOSE 8080
ARG JAR_FILE=target/demo-0.0.1-SNAPSHOT.war
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]