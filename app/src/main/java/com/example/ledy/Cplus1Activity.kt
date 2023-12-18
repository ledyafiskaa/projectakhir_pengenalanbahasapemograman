package com.example.ledy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Cplus1Activity : AppCompatActivity(), View.OnClickListener {

    private lateinit var Btn_kolahraga : Button
    private lateinit var Btn_nextolahraga : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cplus1)
        Btn_kolahraga = findViewById(R.id.btn_kolahraga)
        Btn_kolahraga.setOnClickListener(this)
        Btn_nextolahraga = findViewById(R.id.btn_nextolahraga)
        Btn_nextolahraga.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btn_kolahraga-> {
                val daftar = Intent(this@Cplus1Activity, Cplus2Activity::class.java)
                startActivity(daftar)
            }

            R.id.btn_nextolahraga-> {
                val login = Intent(this@Cplus1Activity, CplusActivity::class.java)
                startActivity(login)

            }
        }
    }
}

