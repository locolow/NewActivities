package com.example.controloscomuns

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

const val PARAM1_NAME = "nome"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun button1(view: View) {
        var edit1 = findViewById<EditText>(R.id.editTextTextPersonName)
        Toast.makeText(this,edit1.text, Toast.LENGTH_SHORT).show()
        findViewById<TextView>(R.id.txt1).setText(edit1.text)
    }

    fun button2(view: View){
        var edit1 = findViewById<EditText>(R.id.editTextTextPersonName)

        val intent = Intent(this, MainActivity2::class.java).apply{
            putExtra(PARAM1_NAME,edit1.text.toString())
        }
        startActivity(intent)
    }
}