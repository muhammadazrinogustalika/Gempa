package com.example.earth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MiniGames : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mini_games)
        val btn_quiz: ImageButton = findViewById(R.id.btn_quiz)

        btn_quiz.setOnClickListener{
            startActivity(Intent(this, Quiz1Activity::class.java))
        }
    }

}