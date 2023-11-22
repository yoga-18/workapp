FROM eclipse-temurin:17
COPY target/workapps.jar workapps.jar
CMD [ "java","-jar","workapps.jar" ]