package com.example.kotlin_xd

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity(), TextWatcher {


    private var eNombre: EditText? = null
    private var eEdad: EditText? = null
    private var textNombre: TextView? = null
    private var textEdad: TextView? = null
    private var nombre: String? = null
    private var edad = 0
    private var miEdad: String? = null

    @SuppressLint("SetTextI18n", "CutPasteId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)



        eNombre = findViewById(R.id.etNombre)
        eEdad = findViewById(R.id.etEdad)
        textNombre = findViewById(R.id.tvMostrarNombre)
        textEdad = findViewById(R.id.etEdad)
        eNombre!!.addTextChangedListener(this)
        eEdad!!.addTextChangedListener(this)


        val btnIr = findViewById<Button>(R.id.pasar)
        btnIr.setOnClickListener {
            val intent: Intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        btEjecutarEstado.setOnClickListener{
            nombre = eNombre?.text.toString()
            edad = Integer.valueOf(eEdad?.text.toString())
            if(edad < 18)
                tvDatosIngresados.text = "Eres menor de edad"
            else
                tvDatosIngresados.text = "Eres mayor de edad"
            Toast.makeText(this,nombre,Toast.LENGTH_LONG).show()
        }
    }

    override fun afterTextChanged(p0: Editable?) {
    }
    override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
    }
    override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
        nombre = eNombre?.text.toString()
        miEdad = eEdad?.text.toString()
        if(nombre !="")tvMostrarNombre?.text = nombre
        if(miEdad !="")tvMostrarEdad?.text = miEdad
    }
    }




