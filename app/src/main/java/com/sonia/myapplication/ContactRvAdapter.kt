package com.sonia.myapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sonia.myapplication.databinding.ContactListItemBinding

class ContactRvAdapter(var contactList: List<ContactData>):RecyclerView.Adapter<ContactViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
       var binding = ContactListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ContactViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return contactList.size
    }
    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var contact = contactList[position]
    holder.binding.apply {
        tvDisplayName.text = contact.displayName
        tvPhoneNumber.text = contact.phoneNumber
        tvEmail.text = contact.email
    }
    }
}
class ContactViewHolder(var binding: ContactListItemBinding): RecyclerView.ViewHolder(binding.root){
}
