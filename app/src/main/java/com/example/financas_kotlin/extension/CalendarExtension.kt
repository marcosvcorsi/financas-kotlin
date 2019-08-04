package com.example.financas_kotlin.extension

import java.text.SimpleDateFormat
import java.util.*

fun Calendar.formatDateBR(): String {
    val strFormat = "dd/MM/yyyy"
    val dateFormat = SimpleDateFormat(strFormat)

    return dateFormat.format(this.time)
}