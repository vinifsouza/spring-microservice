FROM openjdk:21-jdk-slim

WORKDIR /app

COPY pom.xml .
COPY mvnw .
COPY .mvn .mvn
RUN chmod +x mvnw && ./mvnw dependency:go-offline -B
COPY src src

RUN ./mvnw clean package -DskipTests

EXPOSE ${SPRING_PORT:-8080}

CMD ["java", "-jar", "target/user-0.0.1-SNAPSHOT.jar"]
