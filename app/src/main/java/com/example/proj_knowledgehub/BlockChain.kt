package com.example.proj_knowledgehub

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class BlockChain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_block_chain)
        val infobutton = findViewById<Button>(R.id.moreInfo)
         infobutton.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.simplilearn.com/blockchain-programming-languages-article")
            startActivity(intent)
        }
    }
}