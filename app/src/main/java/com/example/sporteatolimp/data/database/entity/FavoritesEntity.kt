package com.example.sporteatolimp.data.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.sporteatolimp.models.Result
import com.example.sporteatolimp.util.Constants.Companion.FAVORITE_RECIPES_TABLE

@Entity(tableName = FAVORITE_RECIPES_TABLE)
class FavoritesEntity(
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    val result: Result
) {
}