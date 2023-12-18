package com.example.ledy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.cardview.widget.CardView

class home : AppCompatActivity(), View.OnClickListener {

    private lateinit var btn_materi : CardView
    private lateinit var btn_acount : CardView
    private lateinit var btn_contoh : CardView
    private lateinit var btn_about : CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        btn_materi = findViewById(R.id.materi)
        btn_materi.setOnClickListener(this)
        btn_acount = findViewById(R.id.acount)
        btn_acount.setOnClickListener(this)
        btn_contoh = findViewById(R.id.contoh)
        btn_contoh.setOnClickListener(this)
        btn_about = findViewById(R.id.about)
        btn_about.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.materi-> {
                val daftar = Intent(this@home, Pemilihanbahasa::class.java)
                startActivity(daftar)
            }
            R.id.acount-> {
                val login = Intent(this@home, profil::class.java)
                startActivity(login)

            }

            R.id.contoh-> {
                val daftar = Intent(this@home, Contohprogram::class.java)
                startActivity(daftar)
            }
            R.id.about-> {
                val login = Intent(this@home, About::class.java)
                startActivity(login)

            }
        }
    }
}