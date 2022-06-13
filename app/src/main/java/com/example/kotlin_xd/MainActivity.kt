package com.example.kotlin_xd

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvHola.text = "Bienvenidos al curso de Android con Kotlin"
        btEjecutar.setOnClickListener{
            tvCadena.text = "Tu nombre es: Juan Perez"
            Toast.makeText(this,"Has cambiado el texto", Toast.LENGTH_LONG).show()

        }
    }
}

