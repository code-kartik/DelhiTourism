package com.example.delhitourism

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.cardview.widget.CardView
import com.bumptech.glide.Glide

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        var splashImage: ImageView = findViewById(R.id.splashImage)
        Glide.with(this).load("https://images.unsplash.com/photo-1561723768-fac4f39555c4?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Nnx8ZGVsaGklMjBzdHJlZXR8ZW58MHx8MHx8&w=1000&q=80").into(splashImage)

        var explore:CardView = findViewById(R.id.explore)
        explore.setOnClickListener {
            var intent = Intent(this@SplashScreen, MainActivity::class.java)
            startActivity(intent)
        }
    }
}