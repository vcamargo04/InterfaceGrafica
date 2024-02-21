package com.example.interfacegrafica

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

        var name = findViewById<EditText>(R.id.txtInsira)
        var buttonText =findViewById<Button>(R.id.btnTxt)

        buttonText.setOnClickListener {
            val msg = "Olá, ${name.text}"
            Toast.makeText(this, msg, Toast.LENGTH_LONG).show()
        }

    }
}