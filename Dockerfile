FROM openjdk:8-jdk-alpine
LABEL org.opencontainers.image.source https://github.com/unal-swarch-2022i-1A/firma_interface
ADD target/interface-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8096
ENTRYPOINT ["java","-jar","/app.jar"]
