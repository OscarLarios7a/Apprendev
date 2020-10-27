package com.example.functionsoperations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


       btnCalcular.setOnClickListener(this)
        btnLimpiar.setOnClickListener(this)


    }

    fun operationSum(numOne:String?,numTwo:String?):String?{
        return  (numOne!!.toInt()+numTwo!!.toInt()).toString()
    }
    fun operationRes(numOne:String?,numTwo:String?):String?{
        return  (numOne!!.toInt()-numTwo!!.toInt()).toString()
    }

    fun operationMul(numOne:String?,numTwo:String?):String?{
        return  (numOne!!.toInt()*numTwo!!.toInt()).toString()
    }

    fun operationDiv(numOne:String?,numTwo:String?):String?{
        return  (numOne!!.toDouble()/numTwo!!.toDouble()).toString()

    }
    fun operationClean(){
        tvRes.text="El Resultado es:"
        etNumOne.text.clear()
        etNumTwo.text.clear()
    }

    fun operationVal(){

    }

    override fun onClick(v: View?) {
        when(v!!.id){
            R.id.btnCalcular ->{
                val numOne1=etNumOne.text.toString()
                val  numTwo2=etNumTwo.text.toString()
                if (numOne1 == "" || numTwo2==""){
                    val toast1 =Toast.makeText(this,"Las Cajas de Textos no pueden estar Vacias",Toast.LENGTH_LONG)
                    toast1.setGravity(0,10,200)
                    toast1.show()
                }else {
                    val res = operationSum(numOne1, numTwo2)
                    val res2 = operationRes(numOne1, numTwo2)
                    val res3 = operationMul(numOne1, numTwo2)
                    val res4 = operationDiv(numOne1, numTwo2)
                    tvRes.text = "El Resultado de la Suma es: $res" +
                            "\nEl Resultado de la Resta es: $res2" +
                            "\nEl Resultado de la Multiplicacion es: $res3" +
                            "\nEl Resultado de la Division es: $res4"
                }
            }
            R.id.btnLimpiar->{
                operationClean()
            }
        }
    }



}