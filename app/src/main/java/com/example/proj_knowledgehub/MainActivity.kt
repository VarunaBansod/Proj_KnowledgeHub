package com.example.proj_knowledgehub

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showGif()
        val letsGoBtn=findViewById<Button>(R.id.LetsGoBtn)

        letsGoBtn.setOnClickListener{
            intent = Intent(applicationContext, Screen2::class.java)
            startActivity(intent)   }
    }
    fun showGif()
    {
        val imgView: ImageView = findViewById(R.id.imageView)
        Glide.with(this).load(R.drawable.welcome_gif).into(imgView)
    }
}