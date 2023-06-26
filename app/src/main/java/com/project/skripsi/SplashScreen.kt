package com.project.skripsi

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate

@Suppress("DEPRECATION")
@SuppressLint("CustomSplashScreen")
class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true)
        val handler = Handler()
        handler.postDelayed({
            startActivity(Intent(applicationContext, MainActivity::class.java))
            finish()
        }, 3000L)
    }
}