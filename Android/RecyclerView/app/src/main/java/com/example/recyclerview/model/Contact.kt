package com.example.recyclerview.model

import java.io.Serializable

data class Contact(
    //val id:Int,
    val name:String,
    val phone:Long,
    val description:String,
    val image:Int
):Serializable