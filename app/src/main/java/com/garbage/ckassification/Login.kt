package com.garbage.ckassification

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.log.*
import kotlinx.android.synthetic.main.log.btnRegister
import kotlinx.android.synthetic.main.login.*
import kotlinx.android.synthetic.main.register.*

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.log)
        getSupportActionBar()!!.setDisplayShowHomeEnabled(true);
        getSupportActionBar()!!.setLogo(R.drawable.icon);
        getSupportActionBar()!!.setDisplayUseLogoEnabled(true);
        btnLogin.setOnClickListener {
            val name = etusername.text.toString()
            val pswd = etPswd.text.toString()
            Intent(this, Profileuser::class.java).also {
                it.putExtra("Extra_name", name)
                it.putExtra("Extra_pswd", pswd)
                startActivity(it)
                finish()
            }
        }
        btnRegister.setOnClickListener {
            startActivity(Intent(this, Register::class.java))
            finish()
        }
    }
}