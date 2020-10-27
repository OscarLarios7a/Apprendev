package com.example.functions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
val TAG:String=MainActivity::class.java.name

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        functionOne(20)
    }
    fun functionOne(numOne:Int):Int{
        return numOne
    }
    fun functionTwo(numTro:Int)
}