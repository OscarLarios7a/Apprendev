package com.example.recyclerfragment.adapter.holder

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerfragment.R

class ContactHolder(view: View): RecyclerView.ViewHolder(view) {
    val tvName = view.findViewById(R.id.tvName) as TextView
    val tvPhone = view.findViewById(R.id.tvNumber) as TextView
    val imgProfile = view.findViewById(R.id.imgContact) as ImageView
}