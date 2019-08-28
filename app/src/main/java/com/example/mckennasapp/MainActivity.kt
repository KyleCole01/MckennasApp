package com.example.mckennasapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_math_section.setOnClickListener {
            startActivity(Intent(this,MathActivity::class.java))
        }
        button_psychology_section.setOnClickListener {
            startActivity(Intent(this,PsychologyActivity::class.java))
        }
        button_fye.setOnClickListener {
            startActivity(Intent(this,FYEActivity::class.java))
        }
    }
}
