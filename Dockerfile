FROM openjdk:21-jdk-slim
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/java-app.jar"]