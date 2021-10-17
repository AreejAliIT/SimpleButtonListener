package com.example.simplebuttonlistener

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btn1 = findViewById<Button>(R.id.btn1)
        btn1.setOnClickListener{ Toast.makeText(this, "Button1 Clicked!!", Toast.LENGTH_SHORT).show()}
    }
    fun btnClicked(view: View){ Toast.makeText(this, "Button2 Clicked!!", Toast.LENGTH_SHORT).show() }

}