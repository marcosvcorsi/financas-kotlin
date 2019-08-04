package com.example.financas_kotlin.model

import java.math.BigDecimal
import java.util.*

class Transaction(val valor: BigDecimal,
                  val categoria: String = "Indefinida",
                  val tipo: TransactionType,
                  val data: Calendar = Calendar.getInstance()){
}