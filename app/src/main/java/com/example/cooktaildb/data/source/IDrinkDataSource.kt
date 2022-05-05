package com.example.cooktaildb.data.source

import com.example.cooktaildb.data.model.Drink
import com.example.cooktaildb.data.source.remote.OnRequestCallback

interface IDrinkDataSource {
    fun getDrinks(category: String, callback: OnRequestCallback<List<Drink>>)
}