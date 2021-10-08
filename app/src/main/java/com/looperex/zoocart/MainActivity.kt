package com.looperex.zoocart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        nameTV.text = intent.getStringExtra("NAME")
        ageTV.text = intent.getIntExtra("AGE",0).toString()
        genderTV.text = intent.getStringExtra("GENDER")
    }

}