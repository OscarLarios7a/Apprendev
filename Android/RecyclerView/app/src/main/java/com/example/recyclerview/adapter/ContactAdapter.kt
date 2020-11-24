package com.example.recyclerview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.R
import com.example.recyclerview.adapter.holder.ContactHolder
import com.example.recyclerview.adapter.listeners.ContactListener
import com.example.recyclerview.model.Contact

class ContactAdapter(val contacts:ArrayList<Contact>,val listener:ContactListener):RecyclerView.Adapter<ContactHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactHolder {
        //creacion de la vista
        return ContactHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_contact,parent,false))
    }

    override fun onBindViewHolder(holder: ContactHolder, position: Int) {
        //Conexion de la vista
        val contact=contacts[position]
        holder.tvName.text=contact.name
        holder.tvPhone.text=contact.phone.toString()
        holder.imgProfile.setImageResource(contact.image)

        holder.itemView.setOnClickListener {
            listener.clickContact(contact)
        }

    }
    override fun getItemCount(): Int {
        //retorno de la cantidad deseada
        return contacts.size
    }


}