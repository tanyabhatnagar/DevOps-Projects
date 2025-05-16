# Use lightweight JDK base image
FROM openjdk:17-alpine

# Set work directory inside container
WORKDIR /app

# Copy the final jar file into the image
COPY application.jar app.jar

# Run the jar
ENTRYPOINT ["java", "-jar", "app.jar"]
