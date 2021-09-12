package com.example.springcloud.fruitinfoservice.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.springcloud.fruitinfoservice.bean.FruitFromFruitInfoService;

@FeignClient(name="fruit-color-extractor-service")
public interface ProxyFruitColorExtractorController {
    @GetMapping(value="/color/{fruit}")
    public FruitFromFruitInfoService getFruitColorObject(@PathVariable String fruit);
}