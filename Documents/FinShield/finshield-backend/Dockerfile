FROM maven:3.9.9-eclipse-temurin-17 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar

EXPOSE 8080

<<<<<<< HEAD
ENTRYPOINT ["java","-jar","/app/app.jar"]
=======
ENTRYPOINT ["java","-jar","/app/app.jar"]
>>>>>>> d8f18841ce51baf106b1ff45861b4acdedb6e35e
