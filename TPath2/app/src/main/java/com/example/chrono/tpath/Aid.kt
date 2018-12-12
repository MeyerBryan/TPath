package com.example.chrono.tpath

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_aid.*

class Aid : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aid)

        schbtn.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.csusm.edu/soe/documents/scholarships/calrta_scholarship_updated.pdf"))
            startActivity(i)
        }

        teachbtn.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://studentaid.ed.gov/sa/types/grants-scholarships/teach"))
            startActivity(i)
        }

        langbtn.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://calstatesanmarcos.wufoo.com/forms/z15sns2m0hxxdrx/"))
            startActivity(i)
        }

        csusmsch.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.csusm.edu/soe/scholarshipsandgrants/"))
            startActivity(i)
        }
        POST.setOnClickListener {
            val intent = Intent(this, Postgrad1::class.java)
            startActivity(intent)
        }

        undergrad2.setOnClickListener {
            val intent = Intent(this, Checklist::class.java)
            startActivity(intent)
        }
    }

}
