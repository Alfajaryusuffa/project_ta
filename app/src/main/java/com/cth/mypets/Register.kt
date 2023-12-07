package com.cth.mypets

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Register : AppCompatActivity() {
    private lateinit var Button_register : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        Button_register = findViewById(R.id.R_btn1)

        Button_register.setOnClickListener{
            val move = Intent (this@Register, MainActivity::class.java)
            startActivity(move)
        }
    }
}