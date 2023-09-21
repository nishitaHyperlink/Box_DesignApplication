package com.example.box_designapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Relative_Layout_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_relative_layout)

        val view1 = findViewById<Button>(R.id.view1)

        view1.setOnClickListener {
            val intent = Intent(this, Linear_Layout_Activity::class.java)
            startActivity(intent)
        }
    }
}