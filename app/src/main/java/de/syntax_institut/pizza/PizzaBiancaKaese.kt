package de.syntax_institut.pizza

import android.widget.ImageView
import android.widget.TextView

class PizzaBiancaKaese(teigzutat: String,teigzutat1:String,teigzutat2:String,val biancakaesezutat: String = "Käse"): PizzaBianca(teigzutat,teigzutat1,teigzutat2,"Ricotta") {
    override fun bake(backen: ImageView) {
        backen.setImageResource(R.drawable.pizza_bianca_kaese)
    }
    override fun textview(zeile1: TextView, zeile2: TextView, zeile3: TextView){
        super.textview(zeile1,zeile2,zeile3)
        zeile2.text = "$biancazutat"
        zeile3.text = "$biancakaesezutat"
    }
}