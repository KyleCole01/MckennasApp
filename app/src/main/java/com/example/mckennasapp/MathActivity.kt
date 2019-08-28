package com.example.mckennasapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_math.*

class MathActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_math)
      button_mathactivity_formulas.setOnClickListener {
          startActivity(Intent(this, MathFormulasActivity::class.java))
      }
        button_mathactivity_solver.setOnClickListener {
            startActivity(Intent(this,MathSolverActivity::class.java))
        }
    }
}
