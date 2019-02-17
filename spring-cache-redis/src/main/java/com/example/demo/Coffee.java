package com.example.demo;

import java.io.Serializable;

public class Coffee implements Serializable {
    private String name;
    private Integer price;

    public Coffee(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }
}
