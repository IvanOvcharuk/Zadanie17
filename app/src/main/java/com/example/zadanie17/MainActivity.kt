package com.example.zadanie17

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        findViewById<Button>(R.id.button1).setOnClickListener {
            findViewById<EditText>(R.id.editTextTextMultiLine).setText(" Ivan \n Ovcharuk")
        }
        findViewById<Button>(R.id.button2).setOnClickListener {
            findViewById<EditText>(R.id.editTextTextPersonName).setText("Ivan Ovcharuk")
        }
    }
}