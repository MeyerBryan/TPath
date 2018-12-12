package com.example.chrono.tpath

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_checklist.*
import kotlinx.android.synthetic.main.activity_postgrad1.*

class Postgrad1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_postgrad1)
        Aidpageback.setOnClickListener{
            val intent = Intent(this, Aid::class.java)
            startActivity(intent)
        }

        Under.setOnClickListener {
            val intent = Intent(this, Checklist::class.java)
            startActivity(intent)
        }
    }
}
