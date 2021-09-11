package com.example.springsamples.actuatorandswaggerapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/") 
    public String sayHello() {
        return "hello world";
    }

    @GetMapping("/hello/{name}") 
    public String sayHello(@PathVariable String name) {
        return String.format("hello, %s", name);
    }
}
