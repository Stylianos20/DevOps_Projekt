# 1. Offizielles Java 17 Image als Basis nutzen
FROM eclipse-temurin:17-jdk-alpine

# 2. Arbeitsverzeichnis im Container festlegen
WORKDIR /app

# 3. Die fertige JAR-Datei aus dem target-Ordner in den Container kopieren
# (Achte darauf, dass deine JAR-Datei exakt so heißt wie in deinem target-Ordner)
COPY target/devops-demo-0.0.1-SNAPSHOT.jar app.jar

# 4. Den Port freigeben, auf dem Spring Boot läuft (standardmäßig 8080)
EXPOSE 8080

# 5. Den Befehl definieren, der beim Start des Containers ausgeführt wird
ENTRYPOINT ["java", "-jar", "app.jar"]