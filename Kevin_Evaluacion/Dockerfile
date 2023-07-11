#inicia con la imagen base que contiene Java runtime
FROM openjdk:17-jdk-alpine

# se agregar el jar del microservicio al contenedor
COPY target/Kevin_Evaluacion-0.0.1-SNAPSHOT.jar Kevin_Evaluacion-0.0.1-SNAPSHOT.jar

#se ejecuta el microservicio
ENTRYPOINT ["java","-jar","/Kevin_Evaluacion-0.0.1-SNAPSHOT.jar"]