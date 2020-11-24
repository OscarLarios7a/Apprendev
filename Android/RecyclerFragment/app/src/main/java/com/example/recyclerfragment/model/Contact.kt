package com.example.recyclerfragment.model

import java.io.Serializable

data class Contact(
    val name:String,
    val phone:Long,
    val description:String,
    val img:Int
):Serializable