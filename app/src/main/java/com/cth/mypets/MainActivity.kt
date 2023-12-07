package com.cth.mypets

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var Text_register : TextView
    private lateinit var Button_login : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Text_register = findViewById(R.id.text_register)
        Button_login = findViewById(R.id.L_btn1)

        Text_register.setOnClickListener{
            val move = Intent(this@MainActivity, Register::class.java)
            startActivity(move)
        }

        Button_login.setOnClickListener{
            val move = Intent(this@MainActivity, Home::class.java)
            startActivity(move)
        }
    }
}