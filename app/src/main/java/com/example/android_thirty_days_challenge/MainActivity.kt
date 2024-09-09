package com.example.android_thirty_days_challenge

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btnIntent = findViewById<Button>(R.id.buttonIntent)
        val btnImplicit = findViewById<Button>(R.id.buttonImplicitIntent)
        val btnWebView = findViewById<Button>(R.id.buttonWebView)

        btnIntent.setOnClickListener{
            //Open a new activity
            intent = Intent(applicationContext, Scrollers::class.java)
            startActivity(intent)
        }

        btnImplicit.setOnClickListener{

            intent = Intent(applicationContext, ImplicitIntentsLab::class.java)
            startActivity(intent)
        }

        btnWebView.setOnClickListener{

            intent = Intent(applicationContext, WebViewsImplementation::class.java)
            startActivity(intent)
        }
    }
}