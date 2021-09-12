package com.example.springcloud.fruitinfoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FruitInfoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FruitInfoServiceApplication.class, args);
	}

}
