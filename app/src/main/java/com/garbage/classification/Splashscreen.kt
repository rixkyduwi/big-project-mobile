package com.garbage.classification

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class Splashscreen: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splashscreen)
        //actionbar
        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = "   Username"
        actionbar.setDisplayShowTitleEnabled(false)
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(
                Intent(
                    this@Splashscreen,
                    Login::class.java
                )
            )
            finish()
        }, 3000)
    }

}