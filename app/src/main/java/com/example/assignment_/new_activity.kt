package com.example.assignment_

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class new_activity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_new)
        val a =findViewById<TextView>(R.id.app)
        val website =findViewById<TextView>(R.id.web)
        val m = findViewById<TextView>(R.id.ml)
        val data = findViewById<TextView>(R.id.da)
        val art = findViewById<TextView>(R.id.ai)
        val digital = findViewById<TextView>(R.id.dm)
        val bt = findViewById<Button>(R.id.btn)
        val phone ="9999999999"

        a.setOnClickListener() {
            intent = Intent(applicationContext,Android::class.java)
            startActivity(intent)
        }

        website.setOnClickListener(){
            intent = Intent(applicationContext,web_act::class.java)
            startActivity(intent)
        }

        m.setOnClickListener(){
            intent = Intent(applicationContext,ml::class.java)
            startActivity(intent)
        }

        data.setOnClickListener(){
            intent = Intent(applicationContext,da::class.java)
            startActivity(intent)
        }

        digital.setOnClickListener(){
            intent = Intent(applicationContext,DM::class.java)
            startActivity(intent)
        }

        art.setOnClickListener(){
            intent = Intent(applicationContext,AI::class.java)
            startActivity(intent)
        }

        bt.setOnClickListener(){
            val intent = Intent(Intent.ACTION_CALL)
            intent.data = Uri.parse("$phone")
            startActivity(intent)
        }



    }
}