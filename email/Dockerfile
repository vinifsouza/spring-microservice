FROM openjdk:21-jdk-slim

WORKDIR /app

COPY pom.xml .
COPY mvnw .
COPY .mvn .mvn

RUN chmod +x mvnw && ./mvnw dependency:go-offline -B

COPY src src

RUN ./mvnw clean package -DskipTests

# Expor a porta
EXPOSE ${SPRING_PORT:-8081}

CMD ["java", "-jar", "target/email-0.0.1-SNAPSHOT.jar"]
