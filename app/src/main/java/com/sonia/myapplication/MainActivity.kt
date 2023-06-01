package com.sonia.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.sonia.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

        override fun onResume() {
        super.onResume()
        displayContacts()

    }

        fun displayContacts(){
        var contact1 = ContactData("","Sonia", "+250 785 188 918", "sonia123@gmail.com")
            var contact2 = ContactData("","Billie", "+250 785 188 918", "Billiewa@gmail.com")
            var contact3 = ContactData("","Ivy", "+250 785 188 918", "Blueivy@gmail.com")
            var contact4 = ContactData("","Grace", "+250 785 188 918", "grace@gmail.com")
            var contact5 = ContactData("","Kardashian", "+250 785 188 918", "kardashian@gmail.com")
            var contact6 = ContactData("","Apiu", "+250 785 188 918", "apiu@gmail.com")
            var contact7 = ContactData("","Alice", "+250 785 188 918", "alice123@gmail.com")
            var contact8 = ContactData("","Pauline", "+250 785 188 918", "pauline@gmail.com")
            var contact9 = ContactData("","Gloria", "+250 785 188 918", "Gloriaa@gmail.com")
            var contact10 = ContactData("","Angela", "+250 785 188 918", "angela77@gmail.com")
            var contact11 = ContactData("","Christine", "+250 785 188 918", "christine@gmail.com")
            var contact12 = ContactData("","Sarah", "+250 785 188 918", "serah404@gmail.com")
            var contact13 = ContactData("","Gubo", "+250 785 188 918", "gubomadiba@gmail.com")
            var contact15 = ContactData("","Vallary", "+250 785 188 918", "vallary@gmail.com")
            var contact16 = ContactData("","Joyce", "+250 785 188 918", "joycewambu@gmail.com")
            var contact17 = ContactData("","Mourine", "+250 785 188 918", "mourinea@gmail.com")

            var contactList = listOf<ContactData>(contact1, contact2, contact3, contact4, contact5, contact6, contact7, contact8, contact9,
            contact10, contact11, contact12, contact13, contact15, contact16, contact17)
            binding.rvContacts.layoutManager = LinearLayoutManager(this)
            var contactRvAdapter = ContactRvAdapter(contactList)
            binding.rvContacts.adapter = contactRvAdapter
    }


}


