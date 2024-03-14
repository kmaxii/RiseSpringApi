FROM openjdk:17

WORKDIR /

COPY .. /

RUN javac RiseSpringApi.java

CMD ["java", "-jar", "RiseSpringApi.jar"]
