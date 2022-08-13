FROM openjdk:11
EXPOSE 9090
ADD target/hotel-service-docker.jar hotel-service-docker.jar
ENTRYPOINT ["java", "-jar", "hotel-service-docker.jar"]