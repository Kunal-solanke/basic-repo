FROM openjdk:11
EXPOSE 8081
ARG JAR_FILE=target/BasicProgramm.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
