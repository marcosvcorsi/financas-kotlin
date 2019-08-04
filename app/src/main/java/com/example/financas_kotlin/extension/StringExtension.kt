package com.example.financas_kotlin.extension

fun String.limitAt(count: Int): String {
    if(this.length > count){
        return "${this.substring(0, count)}..."
    }

    return this
}
