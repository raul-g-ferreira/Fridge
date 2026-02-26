package com.fiasco.Fridge.repository;

import com.fiasco.Fridge.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {


}
