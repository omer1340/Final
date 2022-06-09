package com.example.deneme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.deneme.databinding.ActivityMainOtellerBinding

class MainOteller : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainOtellerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn4.setOnClickListener {

            intent = Intent(applicationContext,MainOtellerAlt1::class.java)
            startActivity(intent)
        }

        binding.btn5.setOnClickListener {

            intent = Intent(applicationContext,MainOtellerAlt2::class.java)
            startActivity(intent)
        }


    }
}