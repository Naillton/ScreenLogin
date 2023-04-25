package com.example.screenlogin

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edte : EditText = findViewById(R.id.editTextTextEmailAddress)
        val edtp : EditText = findViewById(R.id.editTextTextPassword)
        val btn : Button = findViewById(R.id.button)

        btn.setOnClickListener {
            if (edte.text.toString().isNotEmpty() && edtp.text.toString().isNotEmpty()) {
                Toast.makeText(
                    this@MainActivity,
                    "Obrigado por fazer login",
                    Toast.LENGTH_LONG
                ).show()
            } else {
                Toast.makeText(
                    this@MainActivity,
                    "Campos invalidos verfique para fazer login",
                    Toast.LENGTH_LONG
                ).show()
            }
        }
    }
}