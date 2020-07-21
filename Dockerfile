FROM openjdk:14-alpine
COPY target/prueba-jdbc-*.jar prueba-jdbc.jar
EXPOSE 8080
CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar", "prueba-jdbc.jar"]