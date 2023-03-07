package com.example.aula04certa

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageView
import android.widget.Spinner

class pokemon : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pokemon)

        val spinner:Spinner = findViewById(R.id.spinner)
        val ImgView:ImageView = findViewById(R.id.imageView)
        val button:Button = findViewById(R.id.button)

        val pokemons = arrayOf("Selecion", "Bulbassauro", "Charmander", "Squirtle")

        val adapter =  ArrayAdapter(this, android.R.layout.simple_spinner_item, pokemons)

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter

    }
}