package com.example.simpleactivity

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.view.LayoutInflater
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import es.dmoral.toasty.Toasty
import kotlinx.android.synthetic.main.dialog_message.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //showMessageDialog()
        showMessageSecondDialog()
    }
    fun operationSum(numOne:String?,numTwo:String?):String?{
        return  (numOne!!.toInt()+numTwo!!.toInt()).toString()
    }

    fun showMessageSecondDialog(){
        val dialogView=LayoutInflater.from(this).inflate(R.layout.dialog_message,null)
        val alertMessage=AlertDialog.Builder(this).setView(dialogView).show()

        alertMessage.setCancelable(false)
        alertMessage.setCanceledOnTouchOutside(false)

        val btnGet=alertMessage.findViewById<Button>(R.id.btnGet)
        val etNumOne=alertMessage.findViewById<EditText>(R.id.etNumOne)
        val etNumTwo=alertMessage.findViewById<EditText>(R.id.etNumTwo)

        btnGet!!.setOnClickListener{
            val numOne1=etNumOne!!.text.toString()
            val  numTwo2=etNumTwo!!.text.toString()
            if (numOne1 == "" || numTwo2==""){
                Toasty.warning(this, "Las Cajas de Textos no pueden estar Vacias", Toast.LENGTH_SHORT, true).show();
            }else {
                val res = operationSum(numOne1, numTwo2)
                tvRes!!.text = res!!.toString()
            }
            //alertMessage.dismiss()
        }
    }
}