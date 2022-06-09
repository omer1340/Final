package com.example.deneme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.deneme.databinding.ActivityMainOtoparklarBinding

class MainOtoparklar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainOtoparklarBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.but4.setOnClickListener {

            intent = Intent(applicationContext,MainOtoparklarAlt1::class.java)
            startActivity(intent)
        }

        binding.but5.setOnClickListener {

            intent = Intent(applicationContext,MainOtellerAlt2::class.java)
            startActivity(intent)
        }
    }
}