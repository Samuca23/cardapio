package com.br.unidavi.cardapio_back_end.food;

public record FoodResponseDTO(Long id, String title, String image, Integer price) {

    public FoodResponseDTO(Food food) {
        this(food.getId(), food.getTitle(), food.getImage(), food.getPrice());
    }

}
