package com.garbage.ckassification

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.register.*

class Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register)
        getSupportActionBar()!!.setDisplayShowHomeEnabled(true);
        getSupportActionBar()!!.setLogo(R.drawable.icon);
        getSupportActionBar()!!.setDisplayUseLogoEnabled(true);
        btnRegister.setOnClickListener {
            val name = etEmail.text.toString()
            val norumah = etName.text.toString()
            val kontak = etKontak.text.toString()
            val person = Modeluser(name, norumah, kontak)
            Intent(this, Profileuser::class.java).also {
                it.putExtra("Extra_name", name)
                it.putExtra("Extra_norumah", norumah)
                it.putExtra("Extra_kontak", kontak)
                startActivity(it)
                finish()
            }

        }

    }
}