package com.example.currencechangeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CurrencEchangeServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CurrencEchangeServiceApplication.class, args);
    }

}
