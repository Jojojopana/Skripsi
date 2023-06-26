package com.project.skripsi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailPenyakitActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_penyakit)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val penyakit = intent.getParcelableExtra<Penyakit>(DaftarPenyakitActivity.INTENT_PARCELABLE)

        val imgPenyakit = findViewById<ImageView>(R.id.img_item_photo)
        val namePenyakit = findViewById<TextView>(R.id.tv_item_name)
        val descPenyakit = findViewById<TextView>(R.id.tv_item_description)

        imgPenyakit.setImageResource(penyakit?.imgPenyakit!!)
        namePenyakit.text = penyakit.namaPenyakit
        descPenyakit.text = penyakit.descPenyakit

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}