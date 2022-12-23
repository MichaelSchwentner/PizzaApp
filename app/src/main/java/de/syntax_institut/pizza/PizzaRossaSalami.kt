package de.syntax_institut.pizza

import android.widget.ImageView
import android.widget.TextView

class PizzaRossaSalami(teigzutat: String,teigzutat1:String,teigzutat2:String,val rossasalamizutat: String = "Salami"): PizzaRossa(teigzutat,teigzutat1,teigzutat2,"Tomatensoße") {
    override fun bake(backen: ImageView) {
        backen.setImageResource(R.drawable.pizza_rossa_salami)
    }
    override fun textview(zeile1: TextView, zeile2: TextView, zeile3: TextView){
        super.textview(zeile1,zeile2,zeile3)
        zeile2.text = "$rossazutat"
        zeile3.text = "$rossasalamizutat"
    }
}