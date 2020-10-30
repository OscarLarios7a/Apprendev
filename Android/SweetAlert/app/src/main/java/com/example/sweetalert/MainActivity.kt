package com.example.sweetalert

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.andreseko.SweetAlert.SweetAlertDialog
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.dialog_message.*


class MainActivity : AppCompatActivity() {
    lateinit var alertMessage:AlertDialog


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        alertMessageDialog()

        btnSimpleCalculator.setOnClickListener{
            val intent= Intent(this,SecondActivity::class.java)
            startActivity(intent)
        }
    }
    //
    fun alertMessageDialog(){
        val dialogView= LayoutInflater.from(this).inflate(R.layout.dialog_message,null)

        alertMessage= AlertDialog.Builder(this).setView(dialogView).show()
        alertMessage.setCancelable(false)
        alertMessage.setCanceledOnTouchOutside(false)

        alertMessage.btnSuccess.setOnClickListener {
            operationAccess()
        }
        alertMessage.btnCancel.setOnClickListener{
            operationClean()
        }
    }

    fun operationClean() {
        alertMessage.etUser!!.text.clear()
        alertMessage.etpPass!!.text.clear()
    }

    fun operationAccess(){
            val stringUser=alertMessage.etUser!!.text.toString()
            val stringPass=alertMessage.etpPass!!.text.toString()

            if (stringUser == "Oscar" && stringPass == "Larios"){
                val sweetAlertDialog =SweetAlertDialog(this, SweetAlertDialog.SUCCESS_TYPE).setTitleText("Bien Hecho!")
                    sweetAlertDialog.setContentText("Tu usuario y Password Son Correctos!").show()
                alertMessage.dismiss()
            }else if (stringUser == "" || stringPass == ""){
                val sweetAlertDialog =SweetAlertDialog(this, SweetAlertDialog.ERROR_TYPE).setTitleText("Oops...")
                    sweetAlertDialog.setContentText("Faltan Datos!").show()
            }else {
                val sweetAlertDialog =
                    SweetAlertDialog(this, SweetAlertDialog.ERROR_TYPE).setTitleText("Oops...")
                sweetAlertDialog.setContentText("Verificar Datos!").show()
            }


    }
}