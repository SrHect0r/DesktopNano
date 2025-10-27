package com.example.cambiarcontrasea

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class CambiarContraseña : AppCompatActivity() {

    private lateinit var contrasenaEditText: TextInputEditText
    private lateinit var cambiarcontrasenaEditText: TextInputEditText
    private lateinit var confirmarButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.cambiarcontrasena)

        contrasenaEditText = findViewById(R.id.contrasenaEditText)
        cambiarcontrasenaEditText = findViewById(R.id.cambiarcontrasenaEditText)
        confirmarButton = findViewById(R.id.Confirmar)

        confirmarButton.setOnClickListener {
            val contrasena = contrasenaEditText.toString().trim()
            val confirmarcontrasena = cambiarcontrasenaEditText.toString().trim()
            // adawdawdawd
        }
     }
}



