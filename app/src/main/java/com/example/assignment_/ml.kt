package com.example.assignment_

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ml : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ml)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val d = findViewById<CardView>(R.id.dp)
        val data = findViewById<CardView>(R.id.ds)
        val mn = findViewById<CardView>(R.id.nn)
        val node = findViewById<CardView>(R.id.al)

        d.setOnClickListener(){
            intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.ibm.com/topics/deep-learning#:~:text=Deep%20learning%20is%20a%20subset,AI)%20in%20our%20lives%20today.")
            startActivity(intent)
        }
        data.setOnClickListener(){
            intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://aws.amazon.com/what-is/data-science/#:~:text=Data%20science%20is%20the%20study,analyze%20large%20amounts%20of%20data.")
            startActivity(intent)
        }
        mn.setOnClickListener(){
            intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://aws.amazon.com/what-is/neural-network/#:~:text=A%20neural%20network%20is%20a,that%20resembles%20the%20human%20brain.")
            startActivity(intent)
        }
        node.setOnClickListener(){
            intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.ibm.com/topics/machine-learning-algorithms#:~:text=A%20machine%20learning%20algorithm%20is,learning%20(ML)%20to%20learn.")
            startActivity(intent)
        }

    }
}