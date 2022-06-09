package com.example.earth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_quiz_final.*

class QuizFinalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_final)

        var skor = intent.getStringExtra("skor").toString()
        val TVSkorAkhir: TextView = findViewById(R.id.tv_skorakhir)
        val btnHome: Button = findViewById(R.id.btn_home)
        TVSkorAkhir.setText(skor)
        btnHome.setOnClickListener{
            startActivity(Intent(this, HalamanMenu::class.java))
        }

    }
}