package com.example.ledy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    //deklarasi variabel
    private lateinit var btn_register : Button
    private lateinit var btn_login : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_register = findViewById(R.id.btn_register)
        btn_register.setOnClickListener(this)
        btn_login = findViewById(R.id.btn_login)
        btn_login.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btn_register-> {
                val daftar = Intent(this@MainActivity, RegisterActivity::class.java)
                startActivity(daftar)
            }
            R.id.btn_login-> {
                val login = Intent(this@MainActivity, LoginActivity2::class.java)
                startActivity(login)

            }
        }
    }
}
