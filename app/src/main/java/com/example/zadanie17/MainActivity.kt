package com.example.zadanie17

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var x = "Ivan Ovcharuk"
        findViewById<Button>(R.id.button1).setOnClickListener {
            findViewById<EditText>(R.id.editTextTextMultiLine).text
        }
    }
}