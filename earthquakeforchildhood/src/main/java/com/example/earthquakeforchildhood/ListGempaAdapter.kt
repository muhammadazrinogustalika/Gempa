package com.example.earthquakeforchildhood

import android.content.Intent
import android.os.Bundle
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListGempaAdapter(private val ListGempa: ArrayList<gempa>): RecyclerView.Adapter<ListGempaAdapter.ListViewHolder>() {
    inner class ListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    var tvName: TextView = itemView.findViewById(R.id.tv_nama)
        var tvUkuran: TextView = itemView.findViewById(R.id.tv_ukurangempa)
        var ivLogo: ImageView = itemView.findViewById(R.id.civ_gempa)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_gempa,parent,false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return ListGempa.size
    }

    override fun onBindViewHolder(holder: ListGempaAdapter.ListViewHolder, position: Int) {
        val gempa = ListGempa[position]
        Glide.with(holder.itemView.context)
            .load(gempa.GempaLogo)
            .apply(RequestOptions().override(60,60))
            .into(holder.ivLogo)
        holder.tvName.text = gempa.GempaNama
        holder.tvUkuran.text = gempa.ukurangempa
        holder.itemView.setOnClickListener{
            val intent = Intent(holder.itemView.context, JenisGempaDetailActivity::class.java)
            val bundle = Bundle()
            bundle.putInt("imageview", gempa.GempaLogo)
            bundle.putString("textview", gempa.defineGempa)
            intent.putExtras(bundle)
            holder.itemView.context.startActivity(intent)
        }

    }



}