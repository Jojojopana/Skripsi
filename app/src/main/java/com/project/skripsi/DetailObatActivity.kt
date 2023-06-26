package com.project.skripsi

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailObatActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_obat)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val obat = intent.getParcelableExtra<Obat>(DaftarObatActivity.INTENT_PARCELABLE)

        val imgObat = findViewById<ImageView>(R.id.img_item_photo)
        val namaObat = findViewById<TextView>(R.id.tv_item_name)
        val descObat = findViewById<TextView>(R.id.tv_item_description)
        val dosisObat = findViewById<TextView>(R.id.tv_item_dosis)

        imgObat.setImageResource(obat?.imgObat!!)
        namaObat.text = obat.namaObat
        descObat.text = obat.descObat
        dosisObat.text = obat.dosisObat

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
