package com.dgmf.corsspbtspsec.controller;

import com.dgmf.corsspbtspsec.model.Coffee;
import com.dgmf.corsspbtspsec.model.Size;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/coffee")
public class CoffeeController {
    private List<Coffee> coffeeList = new ArrayList<>();

    public CoffeeController() {
        coffeeList.add(new Coffee(1, "Americano", Size.GRANDE));
        coffeeList.add(new Coffee(2, "Latte", Size.VENTI));
        coffeeList.add(new Coffee(3, "Caramel Macchiato", Size.TALL));
    }

    @GetMapping
    public List<Coffee> findAll() {
        return coffeeList;
    }

    @DeleteMapping
    public void delete(Integer id) {
        coffeeList.removeIf(coffee -> coffee.id().equals(id));
    }
}
