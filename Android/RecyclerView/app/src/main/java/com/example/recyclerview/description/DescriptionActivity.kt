package com.example.recyclerview.description

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.recyclerview.R
import com.example.recyclerview.model.Contact
import kotlinx.android.synthetic.main.activity_description.*


class DescriptionActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_description)

        val contact=intent.getSerializableExtra("contact") as Contact
        /*Log.e("TAG","Name:${contact.name}")
        Log.e("TAG","Phone:${contact.phone}")
        Log.e("TAg","Description:${contact.description}")*/
        tvName2.text=contact.name
        imgProfile.setImageResource(contact.image)
        tvNumber2.text=contact.phone.toString()
        tvDesc.text=contact.description


    }

    override fun onBackPressed() {
        super.onBackPressed()
        //El boton del retroceso
        finish()
    }
}