FROM openjdk:8-jdk-alpine

WORKDIR /app

COPY build.gradle .
COPY settings.gradle .
COPY gradlew .
COPY gradle ./gradle

COPY src ./src

RUN ./gradlew

RUN ./gradlew build

ARG JAR_FILE=build/libs/ClusteredDataWarehouse*.jar

# Copy the JAR file to the container
COPY ${JAR_FILE} app.jar

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]
