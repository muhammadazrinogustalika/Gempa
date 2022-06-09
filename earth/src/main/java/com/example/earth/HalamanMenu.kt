package com.example.earth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_halaman_menu.*

class HalamanMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman_menu)

        imageButton.setOnClickListener(){
            val intent = Intent(this,
                Tutorial::class.java)
            startActivity(intent)}

        imageButton2.setOnClickListener(){
            val intent = Intent(this,
                JenisGempa::class.java)
            startActivity(intent)}

        imageButton3.setOnClickListener(){
            val intent = Intent(this,
                MiniGames::class.java)
            startActivity(intent)}

        imageButton4.setOnClickListener(){
            val intent = Intent(this,
                SejarahGempa::class.java)
            startActivity(intent)}

        }
    }




