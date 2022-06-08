package com.example.earthquakeforchildhood

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class ArtiGempa : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_arti_gempa)
        val webviewku: WebView = findViewById(R.id.webviewku)
        webviewku.settings.javaScriptEnabled = true
        webviewku.loadUrl("https://bnpb.go.id/berita/gempa-bumi-edisi-1")
    }
}