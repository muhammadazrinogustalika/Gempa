package com.example.earthquakeforchildhood

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class JenisGempa : AppCompatActivity() {
    private lateinit var rvGempa: RecyclerView
    private  var List: ArrayList<gempa> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jenis_gempa)

        rvGempa = findViewById(R.id.rv_jenisgempa)
        rvGempa.setHasFixedSize(true)

        List.addAll(DataGempa.ListData)
        showRecyleViewListMode()

    }
    private fun showRecyleViewListMode(){
        rvGempa.layoutManager = LinearLayoutManager(this)
        val listGempaAdapter = ListGempaAdapter(List)
        rvGempa.adapter = listGempaAdapter
    }

}