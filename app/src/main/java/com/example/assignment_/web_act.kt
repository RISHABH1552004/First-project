package com.example.assignment_

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class web_act : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_web)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val ht = findViewById<CardView>(R.id.h)
        val cs = findViewById<CardView>(R.id.c)
        val j = findViewById<CardView>(R.id.js)
        val node = findViewById<CardView>(R.id.n)

        ht.setOnClickListener(){
            intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.w3schools.com/html/")
            startActivity(intent)
        }
        cs.setOnClickListener(){
            intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.w3schools.com/css/")
            startActivity(intent)
        }
       j.setOnClickListener(){
            intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.javascript.com/")
            startActivity(intent)
        }
       node.setOnClickListener(){
            intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://nodejs.org/en")
            startActivity(intent)
        }


    }
}