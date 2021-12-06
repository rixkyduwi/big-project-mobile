package com.garbage.classification

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.menu.*

class menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu)

        scan.setOnClickListener {
            startActivity(Intent(this, com.garbage.classification.kalkulator::class.java))
            finish()
        }
        chatbot.setOnClickListener {
            startActivity(Intent(this, com.example.cobacoba.my_profile::class.java))
            finish()
        }
        wikipedia.setOnClickListener {
            startActivity(Intent(this, com.example.cobacoba.project::class.java))
            finish()
        }
    }
}