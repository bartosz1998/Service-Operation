package com.example.service_operator

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.service_operator.databinding.ItemRecylerBinding

class UserAdapter(var datalist:List<Data>): RecyclerView.Adapter<UserAdapter.UserHolder>() {


    class UserHolder(val binding: ItemRecylerBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(get: Data) {
            binding.email.text = get.email
            binding.name.text = get.name

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserHolder {
        val binding = ItemRecylerBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)
        return UserHolder(binding)
    }



    override fun onBindViewHolder(holder: UserHolder, position: Int) {
        holder.bind(datalist.get(position))
    }

    override fun getItemCount(): Int {
        return datalist.size
    }

}