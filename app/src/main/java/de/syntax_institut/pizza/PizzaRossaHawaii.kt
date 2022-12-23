package de.syntax_institut.pizza

import android.widget.ImageView
import android.widget.TextView

class PizzaRossaHawaii(teigzutat:String, teigzutat1: String, teigzutat2:String,val rossahawaii1:String = "Schinken", val rossahawaii2:String = "Ananas"): PizzaRossa(teigzutat,teigzutat1,teigzutat2,"Tomatensoße"){
    override fun bake(backen: ImageView) {
        backen.setImageResource(R.drawable.pizza_rossa_hawaii)
    }
    override fun textview(zeile1: TextView, zeile2: TextView, zeile3: TextView){
        super.textview(zeile1,zeile2,zeile3)
        zeile2.text = "$rossazutat"
        zeile3.text = "${rossahawaii1} & ${rossahawaii2}"
    }
}