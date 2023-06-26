package com.example.recipe.data

import java.io.Serializable

data class Recipe(

    val title: String,
    val IngredientAndPreparation: String,
    val Type: String,
    val NumberOfPeople: Int,
    val DifficultyLevel: String,
    val RecipeImageId: Int = 0

)  : Serializable