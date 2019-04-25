package com.example.pokedesk.fragments

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.pokedesk.Pojos.Pokemon
import com.example.pokedesk.R
import kotlinx.android.synthetic.main.list_element_pokemon.*
import kotlinx.android.synthetic.main.list_element_pokemon.view.*
import kotlinx.android.synthetic.main.main_content_fragment_layout.*


class MainContentFragment : Fragment(){

    var pokemon = Pokemon()

    companion object {
        fun newInstance(pokemon: Pokemon): MainContentFragment{
            val newFragment = MainContentFragment()
            newFragment.pokemon = pokemon
            return newFragment
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val view = inflater.inflate(R.layout.main_content_fragment_layout, container, false)
        bindData(view)

        return view
    }

    fun bindData(view: View) {
        view.tv_pokemon_name.text = pokemon.name
        view.tv_pokemon_id.text = pokemon.id.toString()
        view.tv_pokemon_type.text = pokemon.fsttype

    }

}