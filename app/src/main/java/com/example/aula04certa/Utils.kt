package com.example.aula04certa

import android.content.Context
import android.support.v7.app.AlertDialog

fun showMsg(titulo:String, msg:String, ctx: Context){
    AlertDialog.Builder(ctx)
        .setTitle(titulo)
        .setMessage(msg)
        .setPositiveButton("OK", null)
        .create()
        .show()

}