package com.example.springcloud.fruitinfoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Given a fruit name, it gives information about it.
 * Presently, it calls another fruit color extractor micro-service
 * to get the color of the given fruit.
 * In this way it can call other micro-services to get various information about the fruit.
 * As of now to make the application simple, it is calling only color microservice.
 * 
 * It uses Feign Client to make the communication calls lot easier than using tedious RestTemplate!!!
 */
@SpringBootApplication
@EnableFeignClients
public class FruitInfoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FruitInfoServiceApplication.class, args);
	}

}
