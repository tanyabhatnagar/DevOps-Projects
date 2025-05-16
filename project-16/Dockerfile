FROM eclipse-temurin:21-jre-alpine
WORKDIR /app
# Copy the pre-positioned JAR (no version numbers/paths)
COPY application.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]