package com.cth.mypets

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class cats : AppCompatActivity() {
    private lateinit var Button_anggora : Button
    private lateinit var Button_persia : Button
    private lateinit var Button_british : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cats)

        Button_anggora = findViewById(R.id.anggora)
        Button_persia = findViewById(R.id.persia)
        Button_british = findViewById(R.id.british)

        Button_anggora.setOnClickListener{
            val move = Intent(this@cats, KucingAnggora::class.java)
            startActivity(move)
        }

        Button_persia.setOnClickListener{
            val move = Intent(this@cats, KucingPersia::class.java)
            startActivity(move)
        }

        Button_british.setOnClickListener{
            val move =Intent(this@cats, KucingBritish::class.java)
            startActivity(move)
        }
    }
}