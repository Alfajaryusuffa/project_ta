package com.cth.mypets

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Profile : AppCompatActivity() {
    private lateinit var Button_profile : Button
    private lateinit var Button_logout : Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        Button_profile = findViewById(R.id.edt_profile1)
         Button_logout= findViewById(R.id.edt_logout1)

        Button_logout.setOnClickListener{
            val move = Intent (this@Profile, MainActivity::class.java)
            startActivity(move)
        }

        Button_profile.setOnClickListener{
            val move = Intent (this@Profile, EditProfile::class.java)
            startActivity(move)
        }
    }
}