package com.example.memesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class meme5 : AppCompatActivity() {
    lateinit var button8: TextView
    lateinit var button9: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme5)

        button8=findViewById(R.id.button8)
        button8.setOnClickListener {
            var intent= Intent( this, meme4::class.java)
            startActivity(intent)
        }
        button9=findViewById(R.id.button9)
        button9.setOnClickListener {
            var intent= Intent( this, meme5::class.java)
            startActivity(intent)
        }
    }
}