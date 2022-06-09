package com.example.earthquakeforchildhood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_jenis_gempa_detail.*

class JenisGempaDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jenis_gempa_detail)
        val bundle = intent.extras
        if (bundle != null){
            iv_gambardetail.setImageResource(bundle.getInt("imageview"))
            tv_jenisdetail.setText(bundle.getString("textview"))
        }
        btn_backdetail.setOnClickListener {
            val intent = Intent(this, JenisGempa::class.java)
            startActivity(intent)
        }
    }
}