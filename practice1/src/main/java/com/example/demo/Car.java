package com.example.demo;

public class Car {
    String type;
    String color;

    Car(String type, String color) {
        this.color = color;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
