package com.example.sporteatolimp.bindingadapters

import android.view.View
import android.widget.ProgressBar
import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.example.sporteatolimp.data.database.entity.FoodJokeEntity
import com.example.sporteatolimp.models.FoodJoke
import com.example.sporteatolimp.util.NetworkResult
import com.google.android.material.card.MaterialCardView

@BindingAdapter("readApiResponse3", "readDatabase3", requireAll = false)
fun setCardAndProgressVisibility(
    view: View,
    apiResponse: NetworkResult<FoodJoke>?,
    database: List<FoodJokeEntity>?
) {
    when (apiResponse) {
        is NetworkResult.Loading -> {
            when (view) {
                is ProgressBar -> {
                    view.visibility = View.VISIBLE
                }
                is MaterialCardView -> {
                    view.visibility = View.INVISIBLE
                }
            }
        }

        is NetworkResult.Error -> {
            when (view) {
                is ProgressBar -> {
                    view.visibility = View.INVISIBLE
                }
                is MaterialCardView -> {
                    view.visibility = View.VISIBLE
                    if (database != null) {
                        if (database.isEmpty()) {
                            view.visibility = View.INVISIBLE
                        }
                    }
                }
            }
        }

        is NetworkResult.Success -> {
            when (view) {
                is ProgressBar -> {
                    view.visibility = View.INVISIBLE
                }

                is MaterialCardView -> {
                    view.visibility = View.VISIBLE
                }
            }
        }
    }
}

@BindingAdapter("readApiResponse4", "readDatabase4", requireAll = true)
fun setErrorViewVisibility(
    view: View,
    apiResponse: NetworkResult<FoodJoke>?,
    database: List<FoodJokeEntity>?
){
    if (database != null){
        if (database.isEmpty()){
            view.visibility = View.VISIBLE
            if (view is TextView){
                if (apiResponse != null){
                    view.text = apiResponse.message.toString()
                }
            }
        }
    }

    if (apiResponse is NetworkResult.Success){
        view.visibility = View.INVISIBLE
    }
}