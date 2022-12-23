package de.syntax_institut.pizza

import android.widget.ImageView
import android.widget.TextView

open class Pizza(
    val teigzutat: String,
    val teigzutat1: String,
    val teigzutat2: String
) {
    open fun bake(backen: ImageView) {
        backen.setImageResource(R.drawable.teig)
    }
    open fun textview(zeile1: TextView,zeile2: TextView,zeile3: TextView){
        zeile1.text = "$teigzutat, $teigzutat1, $teigzutat2"
        zeile2.text = ""
        zeile3.text = ""
    }
}
