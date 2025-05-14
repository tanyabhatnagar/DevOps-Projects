cat > project-16/Dockerfile <<EOF
FROM openjdk:11
WORKDIR /app
COPY target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
EOF
