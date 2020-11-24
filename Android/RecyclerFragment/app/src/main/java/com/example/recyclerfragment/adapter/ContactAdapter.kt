package com.example.recyclerfragment.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerfragment.R
import com.example.recyclerfragment.adapter.holder.ContactHolder
import com.example.recyclerfragment.adapter.listeners.ContactListener
import com.example.recyclerfragment.model.Contact

class ContactAdapter(val contacts:ArrayList<Contact>,val listener: ContactListener):RecyclerView.Adapter<ContactHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactHolder {
        return ContactHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_contact,parent,false))
    }

    override fun onBindViewHolder(holder: ContactHolder, position: Int) {
        val contact=contacts[position]

        holder.tvName.text=contact.name
        holder.tvPhone.text=contact.phone.toString()
        holder.imgProfile.setImageResource(contact.img)

        holder.itemView.setOnClickListener {
            listener.clickContact(contact)
        }
    }
    override fun getItemCount(): Int {
        return contacts.size
    }



}