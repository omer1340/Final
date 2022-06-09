package com.example.deneme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.deneme.databinding.ActivityMainIbadetYeriBinding

class MainIbadetYeri : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainIbadetYeriBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn1.setOnClickListener {

            intent = Intent(applicationContext,MainIbadetYeriAlt1::class.java)
            startActivity(intent)
        }

        binding.btn2.setOnClickListener {

            intent = Intent(applicationContext,MainIbadetYeriAlt2::class.java)
            startActivity(intent)
        }

        binding.btn3.setOnClickListener {

            intent = Intent(applicationContext,MainIbadetYeriAlt3::class.java)
            startActivity(intent)
        }
    }
}