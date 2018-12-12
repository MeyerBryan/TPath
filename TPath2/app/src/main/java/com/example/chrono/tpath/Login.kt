package com.example.chrono.tpath

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login2.*

class Login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login2)

        val context = this

        btn_insert.setOnClickListener ({
          if(etvName.text.toString().length > 0 && etvAge.text.toString().length > 0){
              val intent = Intent(this, Checklist::class.java)
              startActivity(intent) }
          else{
            Toast.makeText(context,"Please Fill All Data",Toast.LENGTH_SHORT).show()
             }
        })

        button.setOnClickListener {
            if (etvName.text.toString().length > 0 && etvAge.text.toString().length > 0) {
                val intent = Intent(this, Postgrad1::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(context, "Please Fill All Data", Toast.LENGTH_SHORT).show()
            }
        }


}
}
