package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class OperacoesBasicas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_operacoes_basicas)

        val textValor1: EditText = findViewById(R.id.editTextValor1)
        val textValor2: EditText = findViewById(R.id.editTextValor2)
        val buttonSomar: Button = findViewById(R.id.buttonSomar)
        val buttonSubtrair: Button = findViewById(R.id.buttonSubtrair)
        val buttonMultiplicar: Button = findViewById(R.id.buttonMultiplicar)
        val buttonDividir: Button = findViewById(R.id.buttonDividir)

        val resultado: Number

        buttonSomar.setOnClickListener {
            val valor1 =  textValor1.text.toString().toInt()
            val valor2 =  textValor2.text.toString().toInt()
            val resultado = valor1 + valor2
            showDialog("A soma é: " + resultado)
        }

        buttonSubtrair.setOnClickListener {
            val valor1 =  textValor1.text.toString().toInt()
            val valor2 =  textValor2.text.toString().toInt()
            val resultado = valor1 - valor2
            showDialog("O Resultado é: " + resultado)
        }

        buttonMultiplicar.setOnClickListener {
            val valor1 =  textValor1.text.toString().toInt()
            val valor2 =  textValor2.text.toString().toInt()
            val resultado = valor1 * valor2
            showDialog("O Resultado é: " + resultado)
        }

        buttonDividir.setOnClickListener {
            val valor1 =  textValor1.text.toString().toInt()
            val valor2 =  textValor2.text.toString().toInt()
            val resultado = valor1 / valor2
            showDialog("O Resultado é: " + resultado)
        }


    }
    fun showDialog(msg: String){
        AlertDialog.Builder(this)
            .setMessage(msg)
            .setPositiveButton("OK", null)
            .create()
            .show()
    }





}