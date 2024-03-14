FROM openjdk:17

WORKDIR /app

# Assume your Gradle build outputs the .jar to the build/libs directory
# Adjust the path according to where your .jar file is located
COPY build/libs/RiseSpringApi.jar /app/

CMD ["java", "-jar", "RiseSpringApi.jar"]



#WORKDIR /

#COPY .. /

#RUN javac RiseSpringApi.java

#CMD ["java", "-jar", "RiseSpringApi.jar"]
