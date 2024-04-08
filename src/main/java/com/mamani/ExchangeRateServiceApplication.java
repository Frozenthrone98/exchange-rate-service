package com.mamani;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ExchangeRateServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExchangeRateServiceApplication.class, args);
    }

}
