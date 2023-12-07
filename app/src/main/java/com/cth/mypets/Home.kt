package com.cth.mypets

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Home : AppCompatActivity() {
    private lateinit var Button_cat :Button
    private lateinit var Button_dog : Button
    private lateinit var Button_bird : Button
    private lateinit var Button_profile : ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        Button_cat = findViewById(R.id.H_cats)
        Button_dog = findViewById(R.id.H_dogs)
        Button_bird = findViewById(R.id.H_bird)
        Button_profile = findViewById(R.id.profile)

        Button_cat.setOnClickListener{
            val move = Intent (this@Home, cats::class.java)
            startActivity(move)
        }

        Button_dog.setOnClickListener{
            val move = Intent (this@Home, Dog::class.java)
            startActivity(move)
        }

        Button_bird.setOnClickListener{
            val move = Intent (this@Home, Birds::class.java)
            startActivity(move)
        }

        Button_profile.setOnClickListener{
            val move = Intent (this@Home, Profile::class.java)
            startActivity(move)
        }

    }
}