package com.example.deneme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.deneme.databinding.ActivityMainMarketBinding

class MainMarket : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding= ActivityMainMarketBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn6.setOnClickListener {

            intent = Intent(applicationContext,MainMarketAlt1::class.java)
            startActivity(intent)
        }

        binding.btn7.setOnClickListener {

            intent = Intent(applicationContext,MainMarketAlt2::class.java)
            startActivity(intent)
        }

        binding.btn8.setOnClickListener {

            intent = Intent(applicationContext,MainMarketAlt3::class.java)
            startActivity(intent)
        }
    }
}