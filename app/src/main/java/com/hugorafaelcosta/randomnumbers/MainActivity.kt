package com.hugorafaelcosta.randomnumbers

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    @SuppressLint("SetTextI18n")
    fun getNumber(view:View){
       var texto = findViewById<TextView>(R.id.resultado)

       var numeroSorteado = Random().nextInt(11)
        texto.text = "Numero sorteado é: $numeroSorteado "
    }
}