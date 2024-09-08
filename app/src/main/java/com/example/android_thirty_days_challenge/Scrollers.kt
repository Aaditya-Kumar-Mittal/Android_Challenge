package com.example.android_thirty_days_challenge

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Scrollers : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_scrollers)

        val btnBack = findViewById<Button>(R.id.buttonPrevious)

        btnBack.setOnClickListener{

            intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)

        }

    }
}