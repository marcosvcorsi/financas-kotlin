package com.example.financas_kotlin.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.financas_kotlin.R
import com.example.financas_kotlin.model.Transaction
import kotlinx.android.synthetic.main.item_transaction.view.*
import java.text.SimpleDateFormat

class TransactionListAdapter(ctx: Context,
                             list: List<Transaction>) : BaseAdapter() {

    private val context = ctx
    private val transactionList = list

    override fun getView(pos: Int, view: View?, parent: ViewGroup?): View {
        val createdView = LayoutInflater.from(context).inflate(R.layout.item_transaction, parent, false)

        val transaction = getItem(pos)

        createdView.txt_transaction_value.text = transaction.valor.toString()
        createdView.txt_transaction_name.text = transaction.categoria

        val strFormat = "dd/MM/yyyy"
        val dateFormat = SimpleDateFormat(strFormat)

        createdView.txt_transaction_date.text = dateFormat.format(transaction.data.time)

        return createdView
    }

    override fun getItem(pos: Int): Transaction {
        return transactionList[pos]
    }

    override fun getItemId(p0: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return transactionList.size
    }

}