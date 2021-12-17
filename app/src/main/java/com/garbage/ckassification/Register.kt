package com.garbage.ckassification

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.register.*

class Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register)

        btn_register.setOnClickListener {
            val name = etname.text.toString()
            val norumah = etnorumah.text.toString()
            val kontak = etkontak.text.toString()
            val person = Modeluser(name, norumah, kontak)
            Intent(this, Profiluser::class.java).also {
                it.putExtra("Extra_name", name)
                it.putExtra("Extra_norumah", norumah)
                it.putExtra("Extra_kontak", kontak)
                startActivity(it)
                finish()
            }

        }

    }
    }