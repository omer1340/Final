package com.example.deneme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.Toast
import com.example.deneme.databinding.ActivityMainKayitOlBinding

class MainKayitOl : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainKayitOlBinding.inflate(layoutInflater)
        setContentView(binding.root)

       binding.btnKaydet.setOnClickListener {

           var kullaniciBilgisi = binding.kayitKullaniciAdi.text.toString()
           var kullaniciParola = binding.kayitParola.text.toString()
           var sharedPreferences = this.getSharedPreferences("bilgiler" , MODE_PRIVATE)
           var editor = sharedPreferences.edit()

           //veri ekleme
           editor.putString("kullanici","$kullaniciBilgisi").apply()
           editor.putString("parola","$kullaniciParola").apply()
           Toast.makeText(applicationContext,"Kayıt Başarılı",Toast.LENGTH_LONG).show()
           binding.kayitKullaniciAdi.text.clear()
           binding.kayitParola.text.clear()

       }





        binding.btnGiriseDon.setOnClickListener {
            intent= Intent(applicationContext,MainActivity::class.java)
            startActivity(intent)
        }



    }

}