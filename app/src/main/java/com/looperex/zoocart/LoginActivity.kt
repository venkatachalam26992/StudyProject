package com.looperex.zoocart

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        myFunction()

    }

    private fun myFunction() {

        submitBTN.setOnClickListener {

            val i = Intent(this, MainActivity::class.java)
            i.putExtra("NAME", phoneET.text.toString())
            i.putExtra("AGE", 18)
            i.putExtra("GENDER", "male")
            startActivity(i)
        }

    }

    fun initViews(){

    }

}