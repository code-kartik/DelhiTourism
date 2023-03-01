package com.example.delhitourism

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import com.bumptech.glide.Glide

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        supportActionBar?.hide()

        var splashImage: ImageView = findViewById(R.id.splashImage)
        Glide.with(this).load("https://images.unsplash.com/photo-1561723768-fac4f39555c4?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Nnx8ZGVsaGklMjBzdHJlZXR8ZW58MHx8MHx8&w=1000&q=80").into(splashImage)

        val welcomeText: TextView = findViewById(R.id.welcomeText)

        welcomeText.alpha = 0f
        welcomeText.animate().setDuration(3000).alpha(1f).withEndAction {
            val intent = Intent(this@SplashScreen, MainActivity::class.java)
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
            finish()
        }
    }
}