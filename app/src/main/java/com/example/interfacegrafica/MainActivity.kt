package com.example.interfacegrafica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var nome= findViewById<EditText>(R.id.peixao)
        var buttonText= findViewById<Button>(R.id.buttonSfc)

        buttonText.setOnClickListener{
            val msg= "Olá, ${nome.text}"
            Toast.makeText(this, msg, Toast.LENGTH_LONG).show()
        }
    }
}