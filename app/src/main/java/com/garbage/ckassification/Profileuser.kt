package com.garbage.ckassification

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.user_profile.*

class Profileuser : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.user_profile)
        getSupportActionBar()!!.setDisplayShowHomeEnabled(true);
        getSupportActionBar()!!.setLogo(R.drawable.icon);
        getSupportActionBar()!!.setDisplayUseLogoEnabled(true);
        val name = intent.getStringExtra("Extra_name")
        val norumah = intent.getStringExtra("Extra_norumah")
        val kontak = intent.getStringExtra("Extra_kontak")
        profiluser.text = "$name"
        profilnorumah.text = "NO Rumah : $norumah"
        profilkontak.text ="NO Hp: $kontak"
        logout.setOnClickListener {
            startActivity(Intent(this,Login::class.java))
            finish()
        }
        //actionbar
        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = "$name"
        actionbar.setDisplayShowTitleEnabled(true)
    }
}