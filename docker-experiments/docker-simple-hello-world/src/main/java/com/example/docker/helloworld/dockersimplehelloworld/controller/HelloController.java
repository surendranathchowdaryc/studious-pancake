package com.example.docker.helloworld.dockersimplehelloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping(value="/hello")
    public String get() {
        return "hello docker";
    }

    @GetMapping(value="/")
    public String getHello() {
        return "hello world";
    }
    
}
