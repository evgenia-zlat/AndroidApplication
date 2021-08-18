package com.example.sporteatolimp.data.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.sporteatolimp.models.FoodRecipe
import com.example.sporteatolimp.util.Constants.Companion.RECIPES_TABLE

@Entity(tableName = RECIPES_TABLE)
class RecipesEntity(
    var foodRecipe: FoodRecipe
) {
    @PrimaryKey(autoGenerate = false)
    var id: Int = 0
}