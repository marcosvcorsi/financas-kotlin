package com.example.financas_kotlin.ui.activity

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.example.financas_kotlin.R
import com.example.financas_kotlin.ui.adapter.TransactionListAdapter
import kotlinx.android.synthetic.main.activity_list_transaction.*

class TransactionListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_transaction)

        val transactionList: List<String> = listOf("Teste - R$ 10,00", "Teste - R$ 10,00")

        list_transaction.adapter = TransactionListAdapter(this, transactionList)
    }
}