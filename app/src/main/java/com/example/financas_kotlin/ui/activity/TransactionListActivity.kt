package com.example.financas_kotlin.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.financas_kotlin.R
import com.example.financas_kotlin.model.Transaction
import com.example.financas_kotlin.model.TransactionType
import com.example.financas_kotlin.ui.adapter.TransactionListAdapter
import kotlinx.android.synthetic.main.activity_list_transaction.*
import java.math.BigDecimal

class TransactionListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_transaction)

        val transactionList: List<Transaction> = getTransactionList()

        list_transaction.adapter = TransactionListAdapter(this, transactionList)
    }

    private fun getTransactionList(): List<Transaction> {
        return listOf(
            Transaction(BigDecimal(10.0), "Salario", TransactionType.RECEITA),
            Transaction(BigDecimal(15.0), "Aluguel", TransactionType.DESPESA),
            Transaction(valor = BigDecimal(20.0), tipo = TransactionType.DESPESA),
            Transaction(valor = BigDecimal(30.0), tipo = TransactionType.RECEITA)
        )
    }
}