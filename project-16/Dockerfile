# Use a stable and widely supported JDK base image (non-Alpine)
FROM eclipse-temurin:17-jdk

# Set working directory inside the container
WORKDIR /app

# Copy the packaged JAR from Jenkins workspace into the container
COPY application.jar app.jar

# Run the Spring Boot application
ENTRYPOINT ["java", "-jar", "app.jar"]
