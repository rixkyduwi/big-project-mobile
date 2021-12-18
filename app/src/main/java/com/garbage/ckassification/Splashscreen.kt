package com.garbage.ckassification

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class Splashscreen: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splashscreen)
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