# Use a stable and widely supported JDK base image (non-Alpine)
FROM eclipse-temurin:17-jdk

# Set working directory inside the container
WORKDIR /app

# Copy the packaged JAR from target directory into the container
COPY target/project-16-1.0-SNAPSHOT.jar app.jar

# Run the Spring Boot application
ENTRYPOINT ["java", "-jar", "app.jar"]
