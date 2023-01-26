package com.example.meuprimeiroprojeto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)


        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val tvResult = findViewById<TextView>(R.id.textview_result)
        val tvClassificacao = findViewById<TextView>(R.id.textview_classificacao)

        val result = intent.getFloatExtra("EXTRA_RESULT", 0.1f)

        tvResult.text = result.toString()



        val classificacao = if (result < 16f) {
            "Magreza nível III"
        }else if (result in 16f..16.9f){
             "Magreza nível II"
        }else if (result in 17f..18.4f){
            "Magreza nível I"
        }else if (result in 18.5f..24.9f){
            "Peso ideal"
        }else if (result in 25f..29.9f){
            "Sobrepeso "
        }else if (result in 30f..34.9f) {
            "Obesidade nível I"
        }else if (result in 35f..39.9f){
            "Obesidade nível II"
        }else{
            "Obesidade Grave nível III"
        }

        tvClassificacao.text = getString(R.string.message_classificacao, classificacao)
        }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        finish()
        return super.onOptionsItemSelected(item)
    }

    }
