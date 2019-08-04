package com.example.financas_kotlin.extension

import java.math.BigDecimal
import java.text.DecimalFormat
import java.util.Locale

fun BigDecimal.formatCost(): String{
    val currencyInstance = DecimalFormat.getCurrencyInstance(Locale("pt", "br"))

    return currencyInstance.format(this).replace("R$", "R$ ")
}
