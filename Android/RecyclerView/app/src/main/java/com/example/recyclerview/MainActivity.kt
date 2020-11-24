package com.example.recyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.adapter.ContactAdapter
import com.example.recyclerview.adapter.listeners.ContactListener
import com.example.recyclerview.description.DescriptionActivity
import com.example.recyclerview.model.Contact
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),ContactListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val contacts=ArrayList<Contact>()
        contacts.add(Contact("Rogelio",9512746599,"Alumno de ApprenDev", R.drawable.ic_icons8male))
        contacts.add(Contact("Javier",9512341199,"Alumno de ApprenDev", R.drawable.ic_icons8genderuser))
        contacts.add(Contact("Carolina",9512115199,"Conexion Sex", R.drawable.ic_icons8businesswoman))

        val dividerItem=DividerItemDecoration(this,DividerItemDecoration.VERTICAL)


        val adapter=ContactAdapter(contacts,this)
        rvContacts.layoutManager=LinearLayoutManager(this)
        rvContacts.setHasFixedSize(true)
        rvContacts.addItemDecoration(dividerItem)
        rvContacts.adapter=adapter




    }

    override fun clickContact(contact: Contact) {
       //Toast.makeText(this,"${contact.phone}",Toast.LENGTH_SHORT).show()
        val intent=Intent(this,DescriptionActivity::class.java)
        intent.putExtra("contact",contact)
        startActivity(intent)
    }
}