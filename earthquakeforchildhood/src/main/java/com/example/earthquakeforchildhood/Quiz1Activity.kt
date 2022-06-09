package com.example.earthquakeforchildhood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton

class Quiz1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz1)
        val pilihanA: RadioButton = findViewById(R.id.rb_1a)
        val pilihanB: RadioButton = findViewById(R.id.rb_1b)
        val pilihanC: RadioButton = findViewById(R.id.rb_1c)
        val submit: Button = findViewById(R.id.btn_1submit)
        var skor = 0
        submit.setOnClickListener{
            val intent = Intent(this, Quiz2Activity::class.java)
            if (pilihanA.isChecked){
                skor++
            }
            intent.putExtra("skor",skor.toString())
            startActivity(intent)
        }
    }
}