package com.example.assignment_

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class da : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_da)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val ht = findViewById<CardView>(R.id.dma)
        val cs = findViewById<CardView>(R.id.py)
        val j = findViewById<CardView>(R.id.s)
        val node = findViewById<CardView>(R.id.p)

        ht.setOnClickListener(){
            intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.geeksforgeeks.org/data-manipulation/")
            startActivity(intent)
        }
        cs.setOnClickListener(){
            intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.python.org/")
            startActivity(intent)
        }
        j.setOnClickListener(){
            intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.geeksforgeeks.org/statistics/")
            startActivity(intent)
        }
        node.setOnClickListener(){
            intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.cuemath.com/data/probability/")
            startActivity(intent)
        }

    }
}