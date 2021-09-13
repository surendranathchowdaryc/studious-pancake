package com.example.springcloud.fruitinfoservice.bean;

/**
 * This bean is created to capture the response sent by calling fruit-color-extractor-service
 */
public class FruitFromFruitInfoService {
    private String name;
    private String color;
    private String port;

    public FruitFromFruitInfoService() {
        
    }

    public FruitFromFruitInfoService(String name, String color, String port) {
        this.name = name;
        this.color = color;
        this.port = port;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}