FROM openjdk:8
EXPOSE 9090
ADD target/vehicle-master.war vehicle-master.war
ENTRYPOINT ["java", "-war", "/vehicle-master.war"]