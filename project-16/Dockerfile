# Use a compatible and lightweight JDK base image
FROM eclipse-temurin:17-jdk-alpine

# Set working directory inside the container
WORKDIR /app

# Copy the packaged JAR file from Jenkins workspace to container
COPY application.jar app.jar

# Command to run the Spring Boot application
ENTRYPOINT ["java", "-jar", "app.jar"]
