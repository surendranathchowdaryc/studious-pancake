package com.example.springcloud.fruitcolorextractorservice.Bean;

public class Fruit {
    private String name;
    private String color;
    private String port;

    public Fruit(String name, String color) {
        this.name = name;
        this.color = color;
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
