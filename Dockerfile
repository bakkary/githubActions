FROM eclipse-temurin:17-alpine
# .jar file copied from the target folder
COPY target/app.jar /app.jar
#this is the port that your javalin application will be listening on
EXPOSE 7007
#this is the command line that will run when you start the container
ENTRYPOINT ["java", "-jar", "/app.jar"]