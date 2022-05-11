FROM openjdk:11-jre-slim

WORKDIR /app
COPY ./target/facingapi-0.0.1-SNAPSHOT.jar /app

EXPOSE 8080

CMD ["java", "-jar", "facingapi-0.0.1-SNAPSHOT.jar"]