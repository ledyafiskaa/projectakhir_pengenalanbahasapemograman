package com.example.ledy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class LoginActivity2 : AppCompatActivity(), View.OnClickListener {

    private lateinit var btn_login : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login2)
        btn_login = findViewById(R.id.btn_login)
        btn_login.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){

            R.id.btn_login-> {
                val login = Intent(this@LoginActivity2, home::class.java)
                startActivity(login)

            }
        }
    }
}


