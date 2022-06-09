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
        "Kekuatan gempanya yang tidak terlalu besar"
    )
    private val define_gempa = arrayOf(
        "Gempa Bumi Tektonik merupakan Gempa Bumi yang terjadi karena pergeseran kulit bumi akat lepasnya energi di zona penunjaman. Gempa Bumi Tektonik sering kali menyebabkan kerusakan yang masif salah satu contoh Gempa Bumi Tektonik salah satunya adalah Gempa Palu yang menyebabkan terjadinya Tsunami.",
        "Gempa Bumi Vulkanik merupakan Gempa Bumi yang terjadi karena terjadi aktivitas vulkanis bumi seperti letusan gunung berapi. Gempa Bumi Vulkanik salah satu kasus terbesar diindonesia salah satunya adalah kejadian Tsunami akibat Gunung Anak Kratau yang menyebabkan Tsunami di daerah Banten dan Lampung.",
        "Gempa Bumi Terban atau Runtuhan merupakan Gempa Bumi yang terjadi karena peristiwa longosran. Salah satu contoh kejadian Gempa Bumi Runtuhan adalah akibat dari runtuhan tambang bawah tanah Freeport pada tahun 2013 yang berakibat gempa kecil."
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
                Gempa.defineGempa = define_gempa[position]
                Gempa.GempaLogo = logo[position]
                ListGempa.add(Gempa)
            }
            return ListGempa
        }
}