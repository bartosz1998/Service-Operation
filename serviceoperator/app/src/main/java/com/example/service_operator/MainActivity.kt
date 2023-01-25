package com.example.service_operator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.service_operator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: UserAdapter
    private lateinit var user :List<Data>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        userList()
        binding.rvRecycler.layoutManager = LinearLayoutManager(this)
        adapter = UserAdapter(user)
        binding.rvRecycler.adapter = adapter

    }
    private fun userList(){
        user = listOf(
            Data("Harshita","Harshita@gmail.com"),
            Data("minu","minu@gmail.com"),
            Data("ram","ram@gmail.com"),
            Data("sham","sham@gmail.com"),
            Data("raja","raja@gmail.com"),
            Data("harsh","harsh@gmail.com"),
            Data("harshu","harshu@gmail.com"),
            Data("xyz","xyz@gmail.com"),
            Data("abc","abc@gmail.com"),
            Data("pqr","pqr@gmail.com")
        )
    }

}