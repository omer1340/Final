package com.example.deneme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.deneme.databinding.ActivityMainKategoriBinding

class MainKategori : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainKategoriBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPark.setOnClickListener {

            intent = Intent(applicationContext,MainParklar::class.java)
            startActivity(intent)
        }

        binding.btnKutuphane.setOnClickListener {

            intent = Intent(applicationContext,MainKutuphane::class.java)
            startActivity(intent)
        }

        binding.btnTarHYer.setOnClickListener {

            intent = Intent(applicationContext,MainTarihiYerler::class.java)
            startActivity(intent)
        }

        binding.btnOtel.setOnClickListener {

            intent = Intent(applicationContext,MainOteller::class.java)
            startActivity(intent)
        }

        binding.btnMarket.setOnClickListener {

            intent = Intent(applicationContext,MainMarket::class.java)
            startActivity(intent)
        }

        binding.btnIbadetYerleri.setOnClickListener {

            intent = Intent(applicationContext,MainIbadetYeri::class.java)
            startActivity(intent)
        }

        binding.btnOtopark.setOnClickListener {

            intent = Intent(applicationContext,MainOtoparklar::class.java)
            startActivity(intent)
        }


    }
}