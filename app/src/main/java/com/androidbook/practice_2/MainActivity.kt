package com.androidbook.practice_2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dice1 = findViewById<ImageView>(R.id.dice1)
        val dice2 = findViewById<ImageView>(R.id.dice2)
        val etAnswer = findViewById<EditText>(R.id.etAnswer)
        val btnResult = findViewById<Button>(R.id.btnResult)

        val diceImages = intArrayOf(
            R.drawable.dice1,
            R.drawable.dice2,
            R.drawable.dice3,
            R.drawable.dice4,
            R.drawable.dice5,
            R.drawable.dice6
        )

        val num1 = Random.nextInt(1, 7)
        val num2 = Random.nextInt(1, 7)

        dice1.setImageResource(diceImages[num1 - 1])
        dice2.setImageResource(diceImages[num2 - 1])

        btnResult.setOnClickListener {

            val answerText = etAnswer.text.toString()

            if (answerText.isEmpty()) {
                Toast.makeText(this, "숫자를 입력하세요.", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val answer = answerText.toInt()
            val correctAnswer = num1 + num2

            if (answer == correctAnswer) {
                Toast.makeText(this, "맞았습니다", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "틀렸습니다", Toast.LENGTH_SHORT).show()
            }
        }
    }
}