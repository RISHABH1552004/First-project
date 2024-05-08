package com.example.assignment_

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Android : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_android)

        val k = findViewById<CardView>(R.id.kt)
        val j =findViewById<CardView>(R.id.jv)
        val a = findViewById<CardView>(R.id.andr)
        val i = findViewById<CardView>(R.id.itel)

        k.setOnClickListener(){
           val  intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://kotlinlang.org/")
            startActivity(intent)
        }

        j.setOnClickListener(){
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.java.com/en/")
            startActivity(intent)
        }

        a.setOnClickListener(){
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://developer.android.com/")
            startActivity(intent)

        }
        i.setOnClickListener(){
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.jetbrains.com/idea/")
            startActivity(intent)
        }
    }
}