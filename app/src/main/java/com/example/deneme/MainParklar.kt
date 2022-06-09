package com.example.deneme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.deneme.databinding.ActivityMainParklarBinding

class MainParklar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainParklarBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button5.setOnClickListener {

            intent = Intent(applicationContext,MainParklarAlt1::class.java)
            startActivity(intent)
        }

        binding.button6.setOnClickListener {

            intent = Intent(applicationContext,MainParklarAlt2::class.java)
            startActivity(intent)
        }

        binding.button7.setOnClickListener {

            intent = Intent(applicationContext,MainParklarAlt3::class.java)
            startActivity(intent)
        }
    }
}