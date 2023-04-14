package com.example.aplicacao1404

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2_MostrarMensagem : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity2_mostrar_mensagem)


        val nome = intent.getStringExtra(msg_nome)
        val textViewNome = findViewById<TextView>(R.id.textViewNome)
        textViewNome.text = nome

        val telefone = intent.getStringExtra(msg_telefone)
        val textViewTelefone = findViewById<TextView>(R.id.textViewTelefone)
        textViewTelefone.text = telefone

        val email = intent.getStringExtra(msg_email)
        val textViewEmail = findViewById<TextView>(R.id.textViewEmail)
        textViewEmail.text = email

        val altura = intent.getStringExtra(msg_altura)
        val textViewAltura = findViewById<TextView>(R.id.textViewAltura)
        textViewAltura.text = altura

        val peso = intent.getStringExtra(msg_peso)
        val textViewPeso = findViewById<TextView>(R.id.textViewPeso)
        textViewPeso.text = peso

    }
}