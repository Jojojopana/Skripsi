package com.project.skripsi

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Obat(
    val imgObat: Int,
    val namaObat: String,
    val descObat: String,
    val dosisObat: String
): Parcelable
