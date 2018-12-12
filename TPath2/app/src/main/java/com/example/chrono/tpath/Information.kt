package com.example.chrono.tpath

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_information.*

class Information : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_information)

        btnunder.setOnClickListener{
            val intent = Intent(this, Checklist::class.java)
            startActivity(intent)
        }

        Aidpage3.setOnClickListener{
            val intent = Intent(this, Aid::class.java)
            startActivity(intent)
        }

        Post2.setOnClickListener{
            val intent = Intent(this, Postgrad1::class.java)
            startActivity(intent)
        }

        underPDF.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.csusm.edu/soe/documents/prospectivestudents/pathway/pathwayprogresschecklist.pdf"))
            startActivity(i)
        }

        postPDF.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.csusm.edu/soe/documents/prospectivestudents/pathway/post-baccalaureate-pathway-checklist.pdf"))
            startActivity(i)
        }

    }
}
