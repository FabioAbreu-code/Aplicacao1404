package com.example.aplicacao1404

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText


const val msg_nome = "msg_nome"
const val msg_telefone = "msg_telefone"
const val msg_email = "msg_email"
const val msg_altura = "msg_altura"
const val msg_peso = "msg_peso"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonEnviar = findViewById<Button>(R.id.buttonEnviar)
        buttonEnviar.setOnClickListener {

            enviarMensagem()
        }
    }

    fun enviarMensagem() {
        val editNome = findViewById<EditText>(R.id.editTextTextPersonName)
        val nome = editNome.text.toString()

        val editTelefone = findViewById<EditText>(R.id.editTextPhone)
        val telefone = editTelefone.text.toString()

        val editEmail = findViewById<EditText>(R.id.editTextTextEmailAddress)
        val email = editEmail.text.toString()

        val editAltura = findViewById<EditText>(R.id.editTextHeight)
        val altura = editAltura.text.toString()

        val editPeso = findViewById<EditText>(R.id.editTextWeight)
        val peso = editPeso.text.toString()

        if(nome.isBlank()){
            editNome.error = getString(R.string.nome_vazio)
            editNome.requestFocus()
            return
        }
        if (telefone.isBlank()){
            editTelefone.error = getString(R.string.telefone_vazio)
            editTelefone.requestFocus()
            return
        }
        if (email.isBlank()){
            editEmail.error = getString(R.string.email_vazio)
            editEmail.requestFocus()
            return
        }
        if (altura.isBlank()){
            editAltura.error = getString(R.string.altura_vazio)
            editAltura.requestFocus()
            return
        }
        if (peso.isBlank()){
            editPeso.error = getString(R.string.peso_vazio)
            editPeso.requestFocus()
            return
        }


        val intent = Intent(this, MainActivity2_MostrarMensagem::class.java)
        intent.putExtra(msg_nome,nome)
        intent.putExtra(msg_telefone,telefone)
        intent.putExtra(msg_email,email)
        intent.putExtra(msg_altura,altura)
        intent.putExtra(msg_peso,peso)
        startActivity(intent)

    }

}


