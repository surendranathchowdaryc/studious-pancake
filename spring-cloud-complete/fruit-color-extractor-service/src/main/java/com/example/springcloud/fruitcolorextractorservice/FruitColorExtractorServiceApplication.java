package com.example.springcloud.fruitcolorextractorservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * Simple micro-service to give the color of a given fruit!!!
 */
@SpringBootApplication
public class FruitColorExtractorServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FruitColorExtractorServiceApplication.class, args);
	}

}
