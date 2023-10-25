package com.example.myapplication

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textViewNotes = findViewById<TextView>(R.id.textViewNotes)
        val notas = 0..10
        val builder = StringBuilder()

        for (nota in notas) {
            val mensaje = when (nota.toDouble()) {
                in 0.0..4.5 -> "Suspenso"
                in 4.5..6.0 -> "Suficiente"
                in 6.0..8.0 -> "Notable"
                in 8.0..10.0 -> "Excelente"
                else -> "Nota no válida"

            }
            builder.append("Nota: $nota - $mensaje\n")
        }
        textViewNotes.text = builder.toString()
    }
}

