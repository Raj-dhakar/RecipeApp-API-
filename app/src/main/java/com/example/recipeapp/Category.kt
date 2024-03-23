package com.example.recipeapp

data class Category(
    val idCategory:String,
    val strCategory:String,
    val strCategoryThumb:String,
)

data class CategriesResponse(val categories: List<Category>)
