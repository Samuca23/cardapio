package com.br.unidavi.cardapio_back_end.controller;

import com.br.unidavi.cardapio_back_end.food.Food;
import com.br.unidavi.cardapio_back_end.food.FoodRepository;
import com.br.unidavi.cardapio_back_end.food.FoodRequestDTO;
import com.br.unidavi.cardapio_back_end.food.FoodResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("food")
@CrossOrigin(origins = "*")
public class FoodController {

    @Autowired
    private FoodRepository repository;

    @GetMapping
    public List<FoodResponseDTO> getAll(){
        return repository.findAll().stream().map(FoodResponseDTO::new).toList();
    }

    @PostMapping
    public void saveFood(@RequestBody FoodRequestDTO data) {
        Food foodData = new Food(data);
        repository.save(foodData);
    }

}
