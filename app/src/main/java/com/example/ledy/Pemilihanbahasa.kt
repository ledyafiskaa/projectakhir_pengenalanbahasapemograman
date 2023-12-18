package com.example.ledy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.cardview.widget.CardView

class Pemilihanbahasa : AppCompatActivity(), View.OnClickListener {

    private lateinit var btn_materi1 : CardView
    private lateinit var btn_materi2 : CardView
    private lateinit var btn_materi3 : CardView
    private lateinit var btn_materi4 : CardView
    private lateinit var btn_materi5 : CardView
    private lateinit var btn_materi6 : CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pemilihanbahasa)
        btn_materi1 = findViewById(R.id.materi1)
        btn_materi1.setOnClickListener(this)
        btn_materi2 = findViewById(R.id.materi2)
        btn_materi2.setOnClickListener(this)
        btn_materi3 = findViewById(R.id.materi3)
        btn_materi3.setOnClickListener(this)
        btn_materi4 = findViewById(R.id.materi4)
        btn_materi4.setOnClickListener(this)
        btn_materi5 = findViewById(R.id.materi5)
        btn_materi5.setOnClickListener(this)
        btn_materi6 = findViewById(R.id.materi6)
        btn_materi6.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.materi1-> {
                val daftar = Intent(this@Pemilihanbahasa, CplusActivity::class.java)
                startActivity(daftar)
            }
            R.id.materi2-> {
                val daftar = Intent(this@Pemilihanbahasa, C::class.java)
                startActivity(daftar)
            }
            R.id.materi3-> {
                val daftar = Intent(this@Pemilihanbahasa, Java::class.java)
                startActivity(daftar)
            }
            R.id.materi4-> {
                val daftar = Intent(this@Pemilihanbahasa, JavascriptActivity::class.java)
                startActivity(daftar)
            }
            R.id.materi5-> {
                val daftar = Intent(this@Pemilihanbahasa, php::class.java)
                startActivity(daftar)
            }
            R.id.materi6-> {
                val daftar = Intent(this@Pemilihanbahasa, phyton::class.java)
                startActivity(daftar)
            }
        }
    }
}