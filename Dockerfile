FROM openjdk:17
EXPOSE 8085
ADD ./target/exchange-rate-service-0.0.1.jar exchange-rate-service.jar
ENTRYPOINT ["java","-jar","/exchange-rate-service.jar"]