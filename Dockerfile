FROM eclipse-temurin:22
RUN mkdir /vesperis
COPY target/server.jar /vesperis/server.jar
CMD ["java", "-jar", "/vesperis/server.jar"]