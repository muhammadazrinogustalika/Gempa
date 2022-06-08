package com.example.earthquakeforchildhood

import com.example.earthquakeforchildhood.DataGempa.logo
import com.example.earthquakeforchildhood.DataGempa.tv_ukurangempa

object DataGempa {
    private val namaGempa = arrayOf(
                "Gempa Tektonik",
                "Gempa Vulkanik",
                "Gempa Runtuhan"
    )
    private val tv_ukurangempa = arrayOf(
        "Terjadi akibat adanya pergerakan lempeng-lempeng tektonik bumi",
        "Terjadi di daerah sekitar gunung api",
        "kekuatan gempanya yang tidak terlalu besar"
    )

    private val logo = intArrayOf(
        R.drawable.gempatektonik,
        R.drawable.gempavulkanik,
        R.drawable.gemparuntuhan
    )
    val ListData: ArrayList<gempa>
        get() {
            val ListGempa = arrayListOf<gempa>()
            for (position in namaGempa.indices){
                val Gempa = gempa()
                Gempa.GempaNama = namaGempa[position]
                Gempa.ukurangempa = tv_ukurangempa[position]
                Gempa.GempaLogo = logo[position]
                ListGempa.add(Gempa)
            }
            return ListGempa
        }
}