FROM eclipse-temurin:21
RUN mkdir /opt/app
COPY build/libs/ItemLocator-0.0.1-SNAPSHOT.jar /opt/app
CMD ["java", "-jar", "/opt/app/ItemLocator-0.0.1-SNAPSHOT.jar"]
