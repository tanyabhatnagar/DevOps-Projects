FROM eclipse-temurin:21-jre-alpine
WORKDIR /app
ARG JAR_FILE=target/*.jar  # Default pattern if not specified
COPY ${JAR_FILE} app.jar  # This now works with relative paths
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]