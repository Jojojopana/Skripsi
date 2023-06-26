package com.project.skripsi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class DaftarPenyakitActivity : AppCompatActivity() {
    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar_penyakit)

        val penyakitList = listOf<Penyakit>(
            Penyakit(
                R.drawable.batuk,
                "TB Paru",
                "TB Paru adalah penyakit tuberkulosis yang menyerang paru-paru. TB ini dapat menyebabkan gejala batuk terus menerus lebih dari 3 minggu, batuk berdarah, batuk berlendir, nyeri dada, dan napas tersengal-sengal. Penyebab dari TB Paru sendiri karena terdapat infeksi bakteri <i>Mycrobactrium tuberculosis</i> yang masuk ke paru-paru."
            ),
            Penyakit(
                R.drawable.tulang,
                "TB Tulang",
                "TB Tulang adalah tuberkulosis yang terjadi di luar paru-paru dan menjangkiti tulang belakang. Penyakit ini umumnya menginfeksi tulang belakang pada area toraks (dada belakang) bagian bawah dan vertebra lumbalis (pinggang belakang) atas."
            ),
            Penyakit(
                R.drawable.limfadenitis,
                "TB Limfadenitis",
                "TB Limfadenitis merupakan penyakit tuberkulosis yang menyebabkan peradangan kelenjar getah bening. Gejalanya berupa benjolan kelenjar getah bening, demam tinggi, kelelahan, berat badan turun drastis, keringat berlebih di malam hari."
            ),
            Penyakit(
                R.drawable.meningitis,
                "TB Meningitis",
                "Meningitis TB atau meningitis tuberkulosis adalah suatu penyakit di mana bakteri <i>Mycobacterium tuberculosis</i> menyerang selaput meninges yang melapisi otak serta sistem saraf tulang belakang. Gejala yang timbul ketika terkena penyakit ini adalah terasa sakit kepala, demam, mual, nyeri di sekujur tubuh, rasa sensitif terhadap cahaya, dan leher yang terasa kaku."
            ),
            Penyakit(
                R.drawable.peritonitis,
                "TB Peritonitis",
            "TB Peritonitis adalah peradangan pada selaput tipis yang membatasi dinding perut bagian dalam dan organ-organ perut (peritoneum). Peradangan ini umumnya disebabkan oleh infeksi bakteri atau jamur. Gejalayang kerap muncul pada tuberkulosis jenis ini adalah asites, mual dan muntah, hilang nafsu makan, demam."
            ),
            Penyakit(
                R.drawable.saluran,
                "TB Saluran Pencernaan",
                "TB Saluran pencernaan atau <i>Tuberkulosis gastrointestinal</i> adalah gangguan yang disebabkan oleh bakteri <i>Mycobacterium tuberculosis</i>, yang biasanya menyerang paru-paru, tetapi terjadi di usus. Gangguan ini disebut juga sebagai TBC usus. Saat menyerang, pengidapnya dapat mengalami beberapa gejala gastritis. Gejalanya antara lain adalah perut terasa nyeri, perut terasa berat, hilangnya nafsu makan, turunnya berat badan, dan juga diare."
            ),
            Penyakit(
                R.drawable.urogenital,
                "TB Urogenital",
                "TB urogenital adalah jenis TB ekstra parupaling banyak terjadi kedua setelah TB limfadenitis.Sesuai namanya, TB menyerang organ genital, saluran kemih, atau paling sering terjadi pada ginjal. Biasanya, TB menyebar ke ginjal dari paru-paru melalui darah atau nodus limfa. Umumnya, penderita TB urogenital akan mengalami luka di penis atau saluran genital lainnya. Gejala lainnya, seperti: pembengkakan testis, nyeri buang air kecil, saluran urine tidak lancar atau berkurang, nyeri panggul, nyeri tulang belakang, volume semen berkurang,infertilitas."
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.nama_penyakit)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = PenyakitAdapter(this, penyakitList){
            val intent = Intent(this, DetailPenyakitActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}