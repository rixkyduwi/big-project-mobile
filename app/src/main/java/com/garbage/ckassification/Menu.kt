package com.garbage.ckassification

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.menu.*

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu)
        //actionbar
        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = "   Username"

        actionbar.setDisplayHomeAsUpEnabled(true)

        scan.setOnClickListener {
            startActivity(Intent(this, com.garbage.ckassification.Scan::class.java))
            finish()
        }
        chatbot.setOnClickListener {
            startActivity(Intent(this, com.garbage.ckassification.Chatbot::class.java))
            finish()
        }
        wikipedia.setOnClickListener {
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://id.wikipedia.org/wiki/Sampah" ))
            startActivity(intent)
            finish()

        }
    }
}