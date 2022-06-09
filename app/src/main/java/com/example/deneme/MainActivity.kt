package com.example.deneme

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.deneme.databinding.ActivityMainBinding
import java.util.prefs.AbstractPreferences

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var preferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        preferences = getSharedPreferences("bilgiler", MODE_PRIVATE)

        binding.btnGirisYap.setOnClickListener{
            var KayitliKullanici = preferences.getString("kullanici","")
            var KayitliParola = preferences.getString("parola","")

            var girisKullanici = binding.girisKullaniciAdi.text.toString()
            var girisParola = binding.girisParola.text.toString()

            if ((KayitliKullanici==girisKullanici) && (KayitliParola==girisParola)){

                intent =  Intent(applicationContext,MainKategori::class.java)
                startActivity(intent)
            }else{
                Toast.makeText(applicationContext,"Giriş Bilgileri Hatalı ",Toast.LENGTH_LONG).show()
            }



        }

        binding.btnKayTOl.setOnClickListener{

            intent =  Intent(applicationContext,MainKayitOl::class.java)
            startActivity(intent)

        }


    }
}