package com.cth.mypets

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class EditProfile : AppCompatActivity() {
    private lateinit var Button_update :Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_profile)

        Button_update = findViewById(R.id.update)

        Button_update.setOnClickListener{
            val move = Intent (this@EditProfile, MainActivity::class.java)
            startActivity(move)
        }
    }
}