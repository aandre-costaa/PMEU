package com.example.multilinguagem

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
        Toast.makeText( this, R.string.welcome, Toast.LENGTH_SHORT).show()
        //Update
    }

    fun button1(view: View){

        var editTextHello = findViewById<EditText>(R.id.editTextTextPersonName)
        Toast.makeText(this, editTextHello.text, Toast.LENGTH_SHORT).show()
        findViewById<TextView>(R.id.text1).setText(editTextHello.text)
    }
    
    fun button2(view: View){
        Toast.makeText(this, "button2", Toast.LENGTH_SHORT).show()
    }
}