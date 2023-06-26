package com.project.skripsi

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PeritonitisActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_peritonitis)

        val home = findViewById<Button>(R.id.tbperitonitishomeActivity)

        home.setOnClickListener{
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}