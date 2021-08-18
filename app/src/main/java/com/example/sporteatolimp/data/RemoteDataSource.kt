package com.example.sporteatolimp.data

import com.example.sporteatolimp.data.network.FoodRecipesApi
import com.example.sporteatolimp.models.FoodJoke
import com.example.sporteatolimp.models.FoodRecipe
import retrofit2.Response
import javax.inject.Inject

class RemoteDataSource @Inject constructor(
    private val foodRecipesApi: FoodRecipesApi
) {

    suspend fun getRecipes(queries: Map<String, String>): Response<FoodRecipe> {
        return foodRecipesApi.getRecipes(queries)
    }

    suspend fun searchRecipes(queries: Map<String, String>): Response<FoodRecipe> {
        return foodRecipesApi.searchRecipes(queries)
    }

    suspend fun getFoodJoke(apiKey: String): Response<FoodJoke>{
        return foodRecipesApi.getFoodJoke(apiKey)
    }

}