package com.example.demo;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;


@Component
public class CoffeeCacheComponent {

    private final CoffeeDao coffeeDao;

    public CoffeeCacheComponent(CoffeeDao coffeeDao) {
        this.coffeeDao = coffeeDao;
    }

    @Cacheable(value = "coffees", key = "#name")
    public Coffee findByName(String name){
        return coffeeDao.findByName(name);
    }

}
