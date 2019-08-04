package com.example.financas_kotlin.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import androidx.core.content.ContextCompat
import com.example.financas_kotlin.R
import com.example.financas_kotlin.extension.formatDateBR
import com.example.financas_kotlin.model.Transaction
import com.example.financas_kotlin.model.TransactionType
import kotlinx.android.synthetic.main.item_transaction.view.*

class TransactionListAdapter(ctx: Context,
                             list: List<Transaction>) : BaseAdapter() {

    private val context = ctx
    private val transactionList = list

    override fun getView(pos: Int, view: View?, parent: ViewGroup?): View {
        val createdView = LayoutInflater.from(context).inflate(R.layout.item_transaction, parent, false)

        val transaction = getItem(pos)

        createdView.txt_transaction_value.text = transaction.valor.toString()
        createdView.txt_transaction_name.text = transaction.categoria
        createdView.txt_transaction_date.text = transaction.data.formatDateBR()

        if(transaction.tipo == TransactionType.RECEITA){
            val colorReceita = ContextCompat.getColor(context, R.color.colorPrimary)

            createdView.image_transaction_type.setImageResource(R.drawable.ic_receita)
            createdView.image_transaction_type.setBackgroundColor(colorReceita)
            createdView.txt_transaction_value.setTextColor(colorReceita)
        } else {
            val colorDespesa = ContextCompat.getColor(context, R.color.colorAccent)

            createdView.image_transaction_type.setBackgroundColor(colorDespesa)
            createdView.image_transaction_type.setImageResource(R.drawable.ic_despesa)
            createdView.txt_transaction_value.setTextColor(colorDespesa)
        }

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