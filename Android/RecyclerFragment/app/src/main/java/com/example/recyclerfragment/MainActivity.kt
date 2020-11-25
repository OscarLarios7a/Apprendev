package com.example.recyclerfragment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerfragment.adapter.ContactAdapter
import com.example.recyclerfragment.fragment.DescriptionFragment
import com.example.recyclerfragment.model.Contact

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    val transition=supportFragmentManager.beginTransaction()
        transition.replace(R.id.container,DescriptionFragment())
        transition.addToBackStack(null)
        transition.commit()

    }


}