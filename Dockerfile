# JDK for build stage
FROM openjdk:8-jdk-alpine as build
WORKDIR /maven-build
ADD . .
RUN ./mvnw package

# Java Runtime only
FROM openjdk:8-jre-alpine
WORKDIR /application
COPY --from=build /maven-build/target/*.jar /application/app.jar
EXPOSE 8554
CMD java -Djava.security.egd=file:/dev/./urandom -jar app.jar