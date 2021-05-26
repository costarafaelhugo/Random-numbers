package com.hugorafaelcosta.randomnumbers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun cliqueBotao(view:View){
       var texto = findViewById<TextView>(R.id.textoExibiçao)
        texto.setText("Texto alterado")
    }
}