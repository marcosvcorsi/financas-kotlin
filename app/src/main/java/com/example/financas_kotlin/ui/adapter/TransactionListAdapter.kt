package com.example.financas_kotlin.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.financas_kotlin.R

class TransactionListAdapter(ctx: Context,
                             list: List<String>) : BaseAdapter() {

    private val context = ctx
    private val transactionList = list

    override fun getView(pos: Int, view: View?, parent: ViewGroup?): View {
        return LayoutInflater.from(context).inflate(R.layout.item_transaction, parent, false)
    }

    override fun getItem(pos: Int): String {
        return transactionList[pos]
    }

    override fun getItemId(p0: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return transactionList.size
    }

}