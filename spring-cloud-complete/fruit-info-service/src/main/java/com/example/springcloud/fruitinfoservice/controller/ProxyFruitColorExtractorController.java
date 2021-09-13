package com.example.springcloud.fruitinfoservice.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.springcloud.fruitinfoservice.bean.FruitFromFruitInfoService;

/**
 * Using the exact method signature(just a copy-paste) of the microservice that 
 * needs to be called using the Feign annotation to enable proxy-pattern.
 */
@FeignClient(name="fruit-color-extractor-service")
public interface ProxyFruitColorExtractorController {
    @GetMapping(value="/fruit-color-extractor/color/{fruit}")
    public FruitFromFruitInfoService getFruitColorObject(@PathVariable String fruit);
}