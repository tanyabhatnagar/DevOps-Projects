FROM eclipse-temurin:21-jre-alpine
WORKDIR /app
# Copy the JAR directly (no pattern matching needed)
COPY target/project-16-*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]