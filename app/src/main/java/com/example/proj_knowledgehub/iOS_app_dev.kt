package com.example.proj_knowledgehub

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class iOS_app_dev : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ios_app_dev)
        val infobutton = findViewById<Button>(R.id.moreInfo)
        infobutton.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://distantjob.com/blog/best-language-for-ios-app-development/#:~:text=1.,mean%20programming%20them%20in%20Swift.")
            startActivity(intent)
        }
    }
}