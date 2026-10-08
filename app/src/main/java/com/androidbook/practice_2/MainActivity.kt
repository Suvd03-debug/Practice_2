package com.androidbook.practice_2

import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1 = findViewById<ImageButton>(R.id.btn1)
        val btn2 = findViewById<ImageButton>(R.id.btn2)
        val btn3 = findViewById<ImageButton>(R.id.btn3)

        btn1.setOnClickListener {
            Toast.makeText(this, "틀렸습니다", Toast.LENGTH_SHORT).show()
        }

        btn2.setOnClickListener {
            Toast.makeText(this, "맞았습니다", Toast.LENGTH_SHORT).show()
        }

        btn3.setOnClickListener {
            Toast.makeText(this, "틀렸습니다", Toast.LENGTH_SHORT).show()
        }
    }
}