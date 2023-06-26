package com.project.skripsi

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ObatAdapter(private val context: Context, private val obat: List<Obat>, val listener: (Obat) -> Unit)
    : RecyclerView.Adapter<ObatAdapter.ObatViewHolder>() {
    class ObatViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val imgObat = view.findViewById<ImageView>(R.id.img_item_photo)
        val namaObat = view.findViewById<TextView>(R.id.tv_item_name)
        val descObat = view.findViewById<TextView>(R.id.tv_item_description)
        val dosisObat = view.findViewById<TextView>(R.id.tv_item_dosis)

        fun bindview(obat: Obat, listener: (Obat) -> Unit){
            imgObat.setImageResource(obat.imgObat)
            namaObat.text = obat.namaObat
            descObat.text = obat.descObat
            itemView.setOnClickListener{
                listener(obat)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ObatViewHolder {
        return ObatViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_obat, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ObatViewHolder, position: Int) {
        holder.bindview(obat[position], listener)
    }

    override fun getItemCount(): Int = obat.size


}