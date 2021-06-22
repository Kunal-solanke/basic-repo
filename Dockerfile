FROM openjdk:11
EXPOSE 8081
ARG JAR_FILE=target/BasicProgramm0.0.1.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
