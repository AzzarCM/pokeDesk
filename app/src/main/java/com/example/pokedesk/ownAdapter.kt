package com.example.pokedesk

import android.service.autofill.Dataset
import com.example.pokedesk.Pojos.Pokemon


object AppConstants{
    val datase_savinstance_key = "CLE"
    val MAIN_LIST_KEY = "key_list_pokemon"
}

interface pokeAdapter{
    fun changeDataSet(newDataSet: List<Pokemon>)
}