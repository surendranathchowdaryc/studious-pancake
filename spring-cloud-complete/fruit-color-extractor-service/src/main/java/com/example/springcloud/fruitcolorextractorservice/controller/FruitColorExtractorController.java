package com.example.springcloud.fruitcolorextractorservice.controller;

import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.example.springcloud.fruitcolorextractorservice.Bean.Fruit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class FruitColorExtractorController {

    @Autowired
    private ServletWebServerApplicationContext servletWebServerApplicationContext;
    
    @GetMapping(value="/fruit-color-extractor/color/{fruit}")
    public Fruit getFruitColorObject(@PathVariable String fruit) {
        Fruit f = FruitColorExtractorController.getFruitInfo(fruit);
        f.setPort(String.valueOf(servletWebServerApplicationContext.getWebServer().getPort()));
        return f;
    }

    @GetMapping(value="/")
    public String sayHello() {
        return "welcome to fruit-color-service";
    }

    private static Fruit getFruitInfo(String fruit) {
        Map<String, String> map = Stream.of(new String[][] {
            { "apple", "red/green/yellow" }, 
            { "banana", "yellow" }, 
            { "cherry", "red" }
          }).collect(Collectors.toMap(data -> data[0], data -> data[1]));
        String color =  map.get(fruit);
        Fruit f =  new Fruit(fruit, color);
        return f;
    }
    
}
