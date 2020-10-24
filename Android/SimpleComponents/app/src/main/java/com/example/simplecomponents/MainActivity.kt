package com.example.simplecomponents

import android.app.Activity
//import androidx.appcompat.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etText:EditText=findViewById(R.id.etText)
        val btnClick:Button=findViewById(R.id.btnClick)
        val tvMessage:TextView=findViewById(R.id.tvMessage)

        btnClick.setOnClickListener {
            tvMessage.text=etText.text
        }

    }
}