package com.project.skripsi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class DaftarObatActivity : AppCompatActivity() {
    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar_obat)

        val obatList = listOf<Obat>(
            Obat(R.drawable.obat,
            "Obat Rimfapicin",
            "Rimfapicin TABLET merupakan antibiotik spektrum luas untuk mengobati berbagai penyakit infeksi yang disebabkan oleh bakteri. Obat ini sering diandalkan sebagai salah satu komponen dari obat TBC (Tuberkulosis) karena efektifitasnya dalam membunuh bakteri Mycobacterium Tuberculosis",
            "Dosis dewasa: 8–12 mg/kgBB per hari.\n" +
                    "Dosis anak-anak: 10–20 mg/kgBB per hari."),

            Obat(R.drawable.obat,
            "Obat Etambutol",
            "Ethambutol adalah obat antibiotik untuk mengatasi tuberculosis (TBC). Ethambutol bekerja dengan cara menghentikan pertumbuhan bakteri penyebab Tuberkulosis pada pengobatan Tuberkulosis.",
            "Dewasa: 15 mg/kgBB 1 kali sehari.\n" +
                    "Anak-anak: 25 mg/kgBB 1 kali sehari selama 60 hari."),

            Obat(R.drawable.obat,
            "Obat Pyrazinamide",
            "Pyrazinamide adalah obat untuk mengobati penyakit tuberkulosis (TBC). Obat ini bekerja dengan cara membunuh dan menghentikan perkembangan bakteri penyebab TBC.",
            "Dewasa: Bagi yang memiliki berat badan kurang dari 50 kg, dosis yang digunakan adalah 1,5 gram per hari. Bagi yang memiliki berat badan lebih dari sama dengan 50 kg, dosis yang digunakan adalah 2 gram per hari.\n" +
                    "Anak-anak: 35 mg/kgBB, per hari."
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.nama_obat)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ObatAdapter(this, obatList){
            val intent = Intent(this, DetailObatActivity::class.java)
            intent.putExtra(DaftarObatActivity.INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}