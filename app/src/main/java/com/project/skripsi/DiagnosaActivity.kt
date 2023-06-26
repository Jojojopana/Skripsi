package com.project.skripsi

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import androidx.navigation.findNavController

class DiagnosaActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diagnosa)

        val chckbatuk3minggu = findViewById<CheckBox>(R.id.batuk3minggu)
        val chckbatukberlendir = findViewById<CheckBox>(R.id.batukberlendir)
        val chckbatukdarah = findViewById<CheckBox>(R.id.batukdarah)
        val chcknyeridada = findViewById<CheckBox>(R.id.nyeridada)
        val btndiagnosa = findViewById<Button>(R.id.diagnosa)
        val chcktulangnyeri = findViewById<CheckBox>(R.id.nyeritulangbelakang)
        val chcktulangbengkak = findViewById<CheckBox>(R.id.tulangbengkak)
        val chcktulangbungkuk = findViewById<CheckBox>(R.id.tulangbungkuk)
        val chcktulangkaku = findViewById<CheckBox>(R.id.tulangterasakaku)
        val chckbenjolankelenjar = findViewById<CheckBox>(R.id.benjolangetahbening)
        val chckdemam = findViewById<CheckBox>(R.id.demam)
        val chckkelelahan= findViewById<CheckBox>(R.id.kelelahan)
        val chckkeringat = findViewById<CheckBox>(R.id.keringat)
        val chckbuangair = findViewById<CheckBox>(R.id.nyeribuangairkecil)
        val chcknyeripanggul = findViewById<CheckBox>(R.id.nyeripanggul)
        val chckseringbuangair = findViewById<CheckBox>(R.id.seringbuangair)
        val chckbengkaktestis = findViewById<CheckBox>(R.id.testis)
        val chcksakitperut = findViewById<CheckBox>(R.id.sakitperut)
        val chckhilangnafsumakan = findViewById<CheckBox>(R.id.hilangnafsumakan)
        val chckdiare = findViewById<CheckBox>(R.id.diare)
        val chckmualmuntah = findViewById<CheckBox>(R.id.mualdanmuntah)
        val chckperutberat = findViewById<CheckBox>(R.id.perutterasaberat)
        val chcksakitkepala = findViewById<CheckBox>(R.id.sakitkepala)
        val chcknyeritubuh = findViewById<CheckBox>(R.id.nyeritubuh)
        val chckleherkaku = findViewById<CheckBox>(R.id.leherkaku)
        val chcksensitif = findViewById<CheckBox>(R.id.sensitif)
        val chckasites = findViewById<CheckBox>(R.id.asites)

        btndiagnosa.setOnClickListener{
            if(chckbatuk3minggu.isChecked && chckbatukberlendir.isChecked && chckbatukdarah.isChecked && chcknyeridada.isChecked){
                intent = Intent(this, ParuActivity::class.java)
                startActivity(intent)
            }
            else {
                intent = Intent(this, SehatActivity::class.java)
                startActivity(intent)
            }
            if(chcktulangbengkak.isChecked && chcktulangnyeri.isChecked && chcktulangbungkuk.isChecked && chcktulangkaku.isChecked){
                intent = Intent(this, TulangActivity::class.java)
                startActivity(intent)
            }
            if(chckbenjolankelenjar.isChecked && chckdemam.isChecked && chckkelelahan.isChecked && chckkeringat.isChecked){
                intent = Intent(this, LimfadenitisActivity::class.java)
                startActivity(intent)
            }
            if(chckbuangair.isChecked && chcknyeripanggul.isChecked && chckseringbuangair.isChecked && chckbengkaktestis.isChecked){
                intent = Intent(this, UrogenitalActivity::class.java)
                startActivity(intent)
            }
            if(chcksakitperut.isChecked && chckperutberat.isChecked && chckhilangnafsumakan.isChecked && chckdiare.isChecked && chckmualmuntah.isChecked){
                intent = Intent(this, PencernaanActivity::class.java)
                startActivity(intent)
            }
            if(chcksakitkepala.isChecked && chcknyeritubuh.isChecked && chckleherkaku.isChecked && chcksensitif.isChecked){
                intent = Intent(this, MeningitisActivity::class.java)
                startActivity(intent)
            }
            if(chckasites.isChecked && chckmualmuntah.isChecked && chckdemam.isChecked && chcksakitperut.isChecked){
                intent = Intent(this, PeritonitisActivity::class.java)
                startActivity(intent)
            }
        }
    }
}