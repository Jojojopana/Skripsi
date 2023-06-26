package com.project.skripsi

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Penyakit(
    val imgPenyakit: Int,
    val namaPenyakit: String,
    val descPenyakit: String
): Parcelable
