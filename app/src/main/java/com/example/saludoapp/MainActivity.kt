package com.example.saludoapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var txtTitulo: TextView
    private lateinit var etNombre: EditText
    private lateinit var btnSaludar: Button

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        inicializarComponentes()
        configurarEventoSaludo()

    }



    private fun inicializarComponentes(){

        txtTitulo = findViewById(R.id.txtTitulo)
        etNombre = findViewById(R.id.etNombre)
        btnSaludar = findViewById(R.id.btnSaludar)

    }

    private fun configurarEventoSaludo(){

        btnSaludar.setOnClickListener {
            Toast.makeText(this, "Hola, ${etNombre.text}", Toast.LENGTH_SHORT).show()
        }

    }
}