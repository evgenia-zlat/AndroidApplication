package com.example.sporteatolimp.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.sporteatolimp.data.database.entity.FavoritesEntity
import com.example.sporteatolimp.data.database.entity.FoodJokeEntity
import com.example.sporteatolimp.data.database.entity.RecipesEntity

@Database(
    entities = [RecipesEntity::class, FavoritesEntity::class, FoodJokeEntity::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(RecipesTypeConverter::class)
abstract class RecipesDatabase: RoomDatabase() {

    abstract fun recipesDao(): RecipesDao

}