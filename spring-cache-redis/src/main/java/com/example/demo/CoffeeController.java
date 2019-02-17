package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/coffees")
public class CoffeeController {

    private final CoffeeCacheComponent coffeeCacheComponent;

    public CoffeeController(CoffeeCacheComponent cacheComponent) {
        this.coffeeCacheComponent = cacheComponent;
    }

    @GetMapping("/{name}")
    public Coffee findCoffee(@PathVariable(name = "name") String name){

        return coffeeCacheComponent.findByName(name);
    }


}
