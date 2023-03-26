
FROM amazoncorretto:17-alpine-jdk

COPY target/

ENTRYPOINT ["java","-jar","/app.jar"]