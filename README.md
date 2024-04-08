# Exchange Rate Converter API

This Java Spring Boot application consumes a free service to retrieve the current exchange rate between currencies. It implements a REST API that allows applying this exchange rate to a specified amount, receiving the source currency, the destination currency, and the amount as input parameters. The API returns the original amount, the converted amount with the applied exchange rate, the source and destination currencies, and the exchange rate used.

## Features

- Consumes a free service for exchange rates (https://open.er-api.com/v6/latest).
- Implements a REST API to apply exchange rate to an amount.
- Utilizes Feign to consume the external exchange rate service.
- Stores all applied exchange rate conversions in an in-memory H2 database.
- Dockerized the application and provided Dockerfile for container image creation.
- Additional endpoint to list all saved exchange rate records.
- Project delivered on GitHub with Postman collection for API testing.

## Usage

1. Clone the repository: `git clone https://github.com/Frozenthrone98/exchange-rate-service.git`
2. Build the project: `mvn clean package`
3. Run the application: `java -jar target/exchange-rate-service-0.0.1.jar`

## Docker

1. Build the Docker image: `docker build -t exchange-rate-service:v1 .`
2. Run the Docker container: `docker run -p 8085:8085 --name exchange-rate exchange-rate-service:v1 -d`

## Postman

Import the provided Postman collection (`exchange-service.postman_collection.json`) for testing the API endpoints.

## Note

Angular front-end implementation is not included in this version.
Security implementation is not included in this version.
