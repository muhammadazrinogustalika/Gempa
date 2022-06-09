package com.example.earthquakeforchildhood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_mini_games.*

class MiniGames : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mini_games)

        btn_quiz.setOnClickListener{
            startActivity(Intent(this, Quiz1Activity::class.java))
        }
    }
}