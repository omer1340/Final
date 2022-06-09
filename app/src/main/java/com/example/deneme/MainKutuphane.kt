package com.example.deneme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.deneme.databinding.ActivityMainKutuphaneBinding

class MainKutuphane : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainKutuphaneBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button8.setOnClickListener {

            intent = Intent(applicationContext,MainKutuphaneAlt1::class.java)
            startActivity(intent)
        }

        binding.button9.setOnClickListener {

            intent = Intent(applicationContext,MainKutuphaneAlt2::class.java)
            startActivity(intent)
        }
    }
}