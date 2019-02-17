package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class CoffeeDao {

    public Coffee findByName(String name){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //TODO:DB 연동
        return new Coffee(name,1100);
    }
}
