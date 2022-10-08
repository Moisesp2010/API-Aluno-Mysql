
FROM adoptopenjdk/openjdk11:alpine-jre

COPY target/restapi-0.0.1-SNAPSHOT.jar /app.jar

ENTRYPOINT ["java","-jar","/app.jar"]

EXPOSE 8081

#FROM openjdk:8-jre
#RUN mkdir app
#ARG JAR_FILE
#ADD /target/${JAR_FILE} /app/spring-docker-spotify.jar
#WORKDIR /app
#ENTRYPOINT java -jar spring-docker-spotify.jar

#FROM openjdk:8-jdk-alpine
#EXPOSE 8080
#ARG JAR_FILE=target/demo-app-1.0.0.jar
#ADD ${JAR_FILE} app.jar
#ENTRYPOINT ["java","-jar","/app.jar"]