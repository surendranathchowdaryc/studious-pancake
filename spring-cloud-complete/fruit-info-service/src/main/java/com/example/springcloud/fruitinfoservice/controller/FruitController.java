package com.example.springcloud.fruitinfoservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.example.springcloud.fruitinfoservice.bean.FruitFromFruitInfoService;

@RestController
public class FruitController {

    @Autowired
    private ProxyFruitColorExtractorController proxyFruitColorExtractorController;
    
    @GetMapping("/fruit/{name}")
    public FruitFromFruitInfoService getFruitInfo(@PathVariable String name) {
        FruitFromFruitInfoService fruitFromFruitInfoService = proxyFruitColorExtractorController.getFruitColorObject(name);
        return fruitFromFruitInfoService;
    }

    @GetMapping("/")
    public String sayHello() {
        return "welcome to the fruit-info-service";
    }
}
