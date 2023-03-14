package com.example.aula04certa

import android.app.Activity
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageView
import android.widget.Spinner
import com.example.aula04certa.databinding.ActivityPokemonBinding
import java.text.FieldPosition
//import kotlinx.android.synthetic.main.activity_pokemon.*


class pokemon : AppCompatActivity() {

    lateinit var binding: ActivityPokemonBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPokemonBinding.inflate(layoutInflater)
        setContentView(binding.root)
/*
        val spinner:Spinner = findViewById(R.id.spinner)
        val imageView:ImageView = findViewById(R.id.imageView)
        val button:Button = findViewById(R.id.button)
*/
        val pokemons = arrayOf("Selecion", "Bulbassauro", "Charmander", "Squirtle", "Rattata", "Ditto")

        val adapter =  ArrayAdapter(this, android.R.layout.simple_spinner_item, pokemons)

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.spinner.adapter = adapter

        binding.spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(adapter: AdapterView<*>?, spinner: View?, position: Int, id: Long) {
                when(position){
                    1 -> binding.imageView.setImageDrawable(getDrawable(R.drawable.bulbasaur))
                    2 -> binding.imageView.setImageDrawable(getDrawable(R.drawable.charmander))
                    3 -> binding.imageView.setImageDrawable(getDrawable(R.drawable.squirtle))
                    4 -> binding.imageView.setImageDrawable(getDrawable(R.drawable.rattata))
                    5 -> binding.imageView.setImageDrawable(getDrawable(R.drawable.dito))

                    else -> binding.imageView.setImageDrawable(null)

                }
            }

            override fun onNothingSelected(adapter: AdapterView<*>?) {

            }

        }

        binding.button.setOnClickListener {
            when(binding.spinner.selectedItemPosition){
                1->showMsg("Bulbasaur", "type: grass, poison", this)
                2->showMsg("Charmander", "type: fire", this)
                3->showMsg("Suirtle", "type: water", this)
                4->showMsg("Rattata", "type: normal", this)
                5->showMsg("Ditto", "type: normal", this)
                else -> showMsg("Erro", "Selecione um Pokemon", this)
            }
        }

    }
}