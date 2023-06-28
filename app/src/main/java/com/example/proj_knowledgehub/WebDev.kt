package com.example.proj_knowledgehub

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class WebDev : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_dev)
        val infobutton = findViewById<Button>(R.id.moreInfo)
        infobutton.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://medium.com/javarevisited/top-5-programming-languages-for-web-development-in-2021-f6fd4f564eb6")
            startActivity(intent)
        }
    }
}