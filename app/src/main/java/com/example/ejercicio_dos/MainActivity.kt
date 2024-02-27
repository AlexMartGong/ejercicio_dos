package com.example.ejercicio_dos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var imgDado:ImageView
    lateinit var txt_number:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imgDado = findViewById(R.id.imgDado)
        txt_number = findViewById(R.id.txtNumber)
        //val txtNumber = findViewById<TextView>(R.id.txtNumber)
    }

    //metodo especial para accion
    fun lanzarDado(v: View) {
        Log.e("ErrorDado", "Se presiono el dado")
        val numberAlAzer = Random.nextInt(6) + 1
        txt_number.text = "$numberAlAzer"

        val recursos = when (numberAlAzer) {
            1 -> {
                R.drawable.dice_1
            }
            2 -> {
                R.drawable.dice_2
            }
            3 -> {
                R.drawable.dice_3
            }
            4 -> {
                R.drawable.dice_4
            }
            5 -> {
                R.drawable.dice_5
            }
            else -> {
                R.drawable.dice_6
            }
        }
        imgDado.setImageResource(recursos)
    }
}