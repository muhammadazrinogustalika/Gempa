package com.example.earth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton

class Quiz2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz2)

        val pilihanA: RadioButton = findViewById(R.id.rb_2a)
        val pilihanB: RadioButton = findViewById(R.id.rb_2b)
        val pilihanC: RadioButton = findViewById(R.id.rb_2c)
        val submit: Button = findViewById(R.id.btn_2submit)
        var skor = intent.getStringExtra("skor").toString().toInt()
        submit.setOnClickListener{
            val Intent = Intent(this, QuizFinalActivity::class.java)
            if (pilihanB.isChecked){
                skor++
            }
            intent.putExtra("skor",skor.toString())
            startActivity(intent)
        }

    }
}