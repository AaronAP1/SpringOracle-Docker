# Usa una imagen base de Java
FROM openjdk:17-jdk-slim

# Establece el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copia el archivo JAR de tu aplicación al contenedor
COPY build/libs/PruebaExamen-0.0.1-SNAPSHOT.jar app.jar

# Expone el puerto en el que se ejecutará tu aplicación Spring Boot
EXPOSE 8080

# Comando para ejecutar la aplicación al iniciar el contenedor
CMD ["java", "-jar", "app.jar"]
