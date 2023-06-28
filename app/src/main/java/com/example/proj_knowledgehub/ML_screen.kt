package com.example.proj_knowledgehub

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ML_screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ml_screen)
        val infobutton = findViewById<Button>(R.id.moreInfo)
        infobutton.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.springboard.com/blog/data-science/best-language-for-machine-learning/")
            startActivity(intent)
        }
    }
}