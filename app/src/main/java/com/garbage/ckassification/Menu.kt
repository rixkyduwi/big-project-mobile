package com.garbage.ckassification

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.KeyEvent
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.menu.*

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu)
        //actionbar
        getSupportActionBar()!!.setDisplayShowHomeEnabled(true);
        getSupportActionBar()!!.setLogo(R.drawable.icon);
        getSupportActionBar()!!.setDisplayUseLogoEnabled(true);
        val name = intent.getStringExtra("Extra_name")
        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = "$name"
        actionbar.setDisplayHomeAsUpEnabled(true)
        fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
            // Ketika disentuh tombol back pada Android
            if (keyCode == KeyEvent.KEYCODE_BACK) {
                // method goback() ini berguna untuk kembali ke halaman sebelumnya
                return true
            }

            // Jika tidak ada halaman yang pernah dibuka
            // Maka akan keluar dari activity (tutup aplikasi)
            return onKeyDown(keyCode, event)
        }
        scan.setOnClickListener {
            startActivity(Intent(this, com.garbage.ckassification.Scan::class.java))
            finish()
        }
        chatbot.setOnClickListener {
            startActivity(Intent(this, com.garbage.ckassification.Chatbot::class.java))
            finish()
        }
        wikipedia.setOnClickListener {
            startActivity(Intent(this,wiki::class.java))
            finish()

        }
    }
}