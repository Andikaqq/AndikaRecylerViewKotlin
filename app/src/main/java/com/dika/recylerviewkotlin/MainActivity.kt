package com.dika.recylerviewkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superheroList = listOf<Superhero>(
            Superhero(
                R.drawable.antman,
                nameSuperhero = "Ant-Man",
                desSuperhero = "lorem lipsum lipsum lipsum"

            ),
            Superhero(
                R.drawable.aquament,
                nameSuperhero = "Aquament",
                desSuperhero = "ini super hero terbaik"
            ),
            Superhero(
                R.drawable.batman,
                nameSuperhero = "Batman",
                desSuperhero = " ini super hero"

            ),
            Superhero(
                R.drawable.doctorstrange,
                nameSuperhero = "Doctorstrange",
                desSuperhero = " ini super hero"
        ),
            Superhero(
                R.drawable.holok,
                nameSuperhero = "Holok",
                desSuperhero = " ini super hero"
            ),
            Superhero(
                R.drawable.ironman,
                nameSuperhero = "Ironman",
                desSuperhero = " ini super hero"
            ),
            Superhero(
                R.drawable.loki,
                nameSuperhero = "Loki",
                desSuperhero = " ini super hero"
            ),
            Superhero(
                R.drawable.spaiderman,
                nameSuperhero = "Spaiderman",
                desSuperhero = " ini super hero"
            ),
            Superhero(
                R.drawable.thor,
                nameSuperhero = "Thor",
                desSuperhero = " ini super hero"
            ),
            Superhero(
                R.drawable.ultraman,
                nameSuperhero = "Ultraman",
                desSuperhero = " ini super hero"
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
         recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SuperheroAdapter(this, superheroList){

        }
    }
}