package com.fiasco.Fridge.controller;

import com.fiasco.Fridge.model.Food;
import com.fiasco.Fridge.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/food")
public class FoodController {

    @Autowired
    private FoodService foodService;


    @GetMapping
    public List<Food> getAll() {return foodService.getAll();}

    @PostMapping
    public Food create(@RequestBody Food food) {return  foodService.save(food);}

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {foodService.delete(id);}
}
