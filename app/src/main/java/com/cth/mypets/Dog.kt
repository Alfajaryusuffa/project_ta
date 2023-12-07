package com.cth.mypets

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Dog : AppCompatActivity() {
    private lateinit var Button_beagle : Button
    private lateinit var Button_husky : Button
    private lateinit var Button_poodle : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dog)

        Button_beagle = findViewById(R.id.beagle)
        Button_husky = findViewById(R.id.husky)
        Button_poodle = findViewById(R.id.poodle)

        Button_beagle.setOnClickListener{
            val move = Intent (this@Dog,DogBeagle::class.java)
            startActivity(move)
        }

        Button_husky.setOnClickListener{
            val move = Intent (this@Dog, DogHusky::class.java)
            startActivity(move)
        }

        Button_poodle.setOnClickListener{
            val move = Intent (this@Dog, DogPoodle::class.java)
            startActivity(move)
        }
    }
}