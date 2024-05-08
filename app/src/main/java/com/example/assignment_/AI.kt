package com.example.assignment_

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AI : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ai)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val p = findViewById<CardView>(R.id.py)
        val pro = findViewById<CardView>(R.id.pro)
        val ppy = findViewById<CardView>(R.id.idle)
        val pan = findViewById<CardView>(R.id.pandas)

        p.setOnClickListener(){
            intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.python.org/")
            startActivity(intent)
        }
        pro.setOnClickListener(){
            intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.swi-prolog.org/")
            startActivity(intent)
        }
        ppy.setOnClickListener(){
            intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://docs.python.org/3/library/idle.html")
            startActivity(intent)
        }
        pan.setOnClickListener(){
            intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.codecademy.com/article/introduction-to-numpy-and-pandas")
            startActivity(intent)
        }


    }
}