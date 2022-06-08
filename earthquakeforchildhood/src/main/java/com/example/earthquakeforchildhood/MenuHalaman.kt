package com.example.earthquakeforchildhood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_menu_halaman.*

class MenuHalaman : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_halaman)

        imageButton.setOnClickListener(){
            val intent = Intent(this,
                SurvivalGempa::class.java)
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
                ArtiGempa::class.java)
            startActivity(intent)}

    }
}