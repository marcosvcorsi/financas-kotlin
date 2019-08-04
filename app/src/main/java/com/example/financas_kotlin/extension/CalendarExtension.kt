package com.example.financas_kotlin.extension

import java.text.SimpleDateFormat
import java.util.*

fun Calendar.formatDateBR(): String {
    return SimpleDateFormat("dd/MM/yyyy").format(this.time)
}