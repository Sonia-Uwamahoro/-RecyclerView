package com.sonia.myapplication

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sonia.myapplication.databinding.ContactListItemBinding
import com.squareup.picasso.Picasso
import jp.wasabeef.picasso.transformations.CropCircleTransformation

class ContactRvAdapter(var contactList: List<ContactData>):RecyclerView.Adapter<ContactViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
       var binding = ContactListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ContactViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return contactList.size
    }
//    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
//        var contact = contactList[position]
//    holder.binding.apply {
//        tvDisplayName.text = contact.displayName
//        tvPhoneNumber.text = contact.phoneNumber
//        tvEmail.text = contact.email
//
////        binding.fbplus.setOnClickListener {
////            val intent = Intent(holder.itemView.context, MainActivity2::class.java)
////            holder.itemView.context.startActivity(intent)
////        }
//
//        Picasso
//            .get()
//            .load(contact.avatar)
//            .resize(80,80)
//            .centerCrop()
//            .transform(CropCircleTransformation())
//            .into(holder.binding.ivContact)
//
//    }
//    }
//}

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var currentContact = contactList[position]
        var  binding=holder.binding
        binding.ivContact.tag=currentContact.avatar
        binding.tvDisplayName.text=currentContact.displayName
        binding.tvPhoneNumber.text=currentContact.phoneNumber
        binding.tvEmail.text =currentContact.email

        binding.tvbutton.setOnClickListener {
            val intent = Intent(holder.itemView.context, Adding::class.java)
            holder.itemView.context.startActivity(intent)
        }
        Picasso
            .get()
            .load(currentContact.avatar)
            .resize(80,80)
            .centerCrop()
            .transform(CropCircleTransformation())
            .into(binding.ivContact)


    }
}


class ContactViewHolder(var binding: ContactListItemBinding): RecyclerView.ViewHolder(binding.root){
}
