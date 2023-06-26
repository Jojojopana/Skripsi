package com.project.skripsi

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PenyakitAdapter(private val context: Context, private val penyakit: List<Penyakit>, val listener: (Penyakit) -> Unit)
    :RecyclerView.Adapter<PenyakitAdapter.PenyakitViewHolder>() {
    class PenyakitViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val imgPenyakit = view.findViewById<ImageView>(R.id.img_item_photo)
        val namePenyakit = view.findViewById<TextView>(R.id.tv_item_name)
        val descPenyakit = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindview(penyakit: Penyakit, listener: (Penyakit) -> Unit){
            imgPenyakit.setImageResource(penyakit.imgPenyakit)
            namePenyakit.text = penyakit.namaPenyakit
            descPenyakit.text = penyakit.descPenyakit
            itemView.setOnClickListener{
                listener(penyakit)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PenyakitViewHolder {
        return PenyakitViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_penyakit, parent, false)
        )
    }

    override fun onBindViewHolder(holder: PenyakitViewHolder, position: Int) {
        holder.bindview(penyakit[position], listener)
    }

    override fun getItemCount(): Int = penyakit.size


    }