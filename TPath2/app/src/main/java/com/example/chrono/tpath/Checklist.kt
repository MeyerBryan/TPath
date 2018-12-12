package com.example.chrono.tpath

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_checklist.*


class Checklist : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checklist)

        Aidpage.setOnClickListener{
            val intent = Intent(this, Aid::class.java)
            startActivity(intent)
        }

        Post.setOnClickListener {
            val intent = Intent(this, Postgrad1::class.java)
            startActivity(intent)
        }
        button2.setOnClickListener {
            val intent = Intent(this, Information::class.java)
            startActivity(intent)
        }
    }
}
