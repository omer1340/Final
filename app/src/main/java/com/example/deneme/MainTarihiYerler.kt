package com.example.deneme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.deneme.databinding.ActivityMainTarihiYerlerBinding

class MainTarihiYerler : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainTarihiYerlerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.but1.setOnClickListener {

            intent = Intent(applicationContext,MainTarihiYerlerAlt1::class.java)
            startActivity(intent)
        }

        binding.but2.setOnClickListener {

            intent = Intent(applicationContext,MainTarihiYerlerAlt2::class.java)
            startActivity(intent)
        }

        binding.but3.setOnClickListener {

            intent = Intent(applicationContext,MainTarihiYerlerAlt3::class.java)
            startActivity(intent)
        }


    }
}