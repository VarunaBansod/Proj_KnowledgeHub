package com.example.proj_knowledgehub

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

class Screen2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen2)
        val androidView = findViewById<CardView>(R.id.card_android)
        val webView = findViewById<CardView>(R.id.card_web)
        val iosView = findViewById<CardView>(R.id.card_ios)
        val mlView = findViewById<CardView>(R.id.card_ml)
        val gdView = findViewById<CardView>(R.id.card_graphic)
        val bcView = findViewById<CardView>(R.id.card_bc)
        val callintent = findViewById<Button>(R.id.call_button)


        //android card view
        androidView.setOnClickListener{
            intent = Intent(applicationContext, AndroidScreen::class.java)
            startActivity(intent)
        }
        //web_dev card view
        webView.setOnClickListener{
            intent = Intent(applicationContext, WebDev::class.java)
            startActivity(intent)
        }
        //ios card view
        iosView.setOnClickListener{
            intent = Intent(applicationContext, iOS_app_dev::class.java)
            startActivity(intent)
        }
        //ml card view
        mlView.setOnClickListener{
            intent = Intent(applicationContext, ML_screen::class.java)
            startActivity(intent)
        }
        //blockchain card view
        bcView.setOnClickListener{
            intent = Intent(applicationContext, BlockChain::class.java)
            startActivity(intent)
        }
        //graphic design card view
        gdView.setOnClickListener{
                val intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse("https://blog.shillingtoneducation.com/how-to-learn-graphic-design/")
                startActivity(intent)
        }
        //call button code
        callintent.setOnClickListener {
            val callIntent = Intent(Intent.ACTION_DIAL)
            callIntent.data = Uri.parse("tel:" + 8462023497)
            startActivity(callIntent)
        }
    }
}