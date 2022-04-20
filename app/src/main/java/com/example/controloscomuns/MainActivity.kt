package com.example.controloscomuns

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


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
}