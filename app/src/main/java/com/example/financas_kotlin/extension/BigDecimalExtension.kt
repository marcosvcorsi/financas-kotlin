package com.example.financas_kotlin.extension

import java.math.BigDecimal
import java.text.DecimalFormat
import java.util.Locale

fun BigDecimal.formatCost(): String{
    val currencyInstance = DecimalFormat.getCurrencyInstance(Locale("pt", "br"))

    val format = currencyInstance.format(this)

    return format.replace("R$", "R$ ");
}
