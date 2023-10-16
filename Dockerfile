FROM openjdk:17-jdk-alpine
COPY out/artifacts/javaRestMongo_jar/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
