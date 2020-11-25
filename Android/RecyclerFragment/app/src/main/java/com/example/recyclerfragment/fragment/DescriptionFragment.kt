package com.example.recyclerfragment.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerfragment.R
import com.example.recyclerfragment.adapter.ContactAdapter
import com.example.recyclerfragment.adapter.listeners.ContactListener
import com.example.recyclerfragment.model.Contact
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_description.*


class DescriptionFragment : Fragment(), ContactListener {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_description, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val contacts=ArrayList<Contact>()
        contacts.add(Contact("Rogelio Cardenas ",9512746599,"Alumno de ApprenDev", R.drawable.ic_icons8male))
        contacts.add(Contact("Javier Larios",9512341199,"Alumno de ApprenDev", R.drawable.ic_icons8male))
        contacts.add(Contact("Carolina Jacome",9512115199,"Alumno sin acceso", R.drawable.ic_icons8businesswoman))

        val adapter= ContactAdapter(contacts,this)
        val dividerItem= DividerItemDecoration(requireContext(), DividerItemDecoration.VERTICAL)
        rvContacts.addItemDecoration(dividerItem)
        rvContacts.layoutManager= LinearLayoutManager(requireContext())
        rvContacts.setHasFixedSize(true)
        rvContacts.adapter=adapter

    }

    override fun clickContact(contact: Contact) {
        Toast.makeText(requireContext(),"${contact.phone}",Toast.LENGTH_SHORT).show()

    }


}