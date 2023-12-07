package com.cth.mypets

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Birds : AppCompatActivity() {
    private lateinit var Button_parkit : Button
    private lateinit var Button_lovebird : Button
    private lateinit var Button_kakaktua : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birds)

        Button_parkit = findViewById(R.id.parkit)
        Button_lovebird = findViewById(R.id.lovebird)
        Button_kakaktua = findViewById(R.id.kakaktua)

        Button_parkit.setOnClickListener{
            val move = Intent (this@Birds, BurungParkit::class.java)
            startActivity(move)
        }

        Button_lovebird.setOnClickListener{
            val move = Intent (this@Birds, BurungLoveBird::class.java)
            startActivity(move)
        }

        Button_kakaktua.setOnClickListener{
            val move = Intent (this@Birds, BurungKakakTua::class.java)
            startActivity(move)
        }
    }
}