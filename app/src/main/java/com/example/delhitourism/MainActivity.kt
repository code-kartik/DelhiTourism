package com.example.delhitourism

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.ScrollView
import androidx.appcompat.app.AppCompatActivity
import androidx.browser.customtabs.CustomTabsIntent
import androidx.cardview.widget.CardView
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

        supportActionBar?.setTitle("Welcome to Delhi")

        val imageslide:ImageSlider = findViewById(R.id.imageslider)
        val slide: ArrayList<SlideModel> = ArrayList()

        slide.add(SlideModel("https://i.pinimg.com/736x/40/8a/d0/408ad0209060871deb6458aaa43d7e38.jpg",ScaleTypes.FIT))
        slide.add(SlideModel("https://www.holidify.com/images/bgImages/DELHI.jpg",ScaleTypes.FIT))
        slide.add(SlideModel("https://lagavetavoladora.com/wp-content/uploads/2015/06/Templo-del-Loto-e1435253152857.jpg",ScaleTypes.FIT))
        slide.add(SlideModel("https://assets.traveltriangle.com/blog/wp-content/uploads/2015/08/Rashtrapati-Bhavan.jpg",ScaleTypes.FIT))
        slide.add(SlideModel("https://blog.urbanadventures.com/wp-content/uploads/2017/10/BAPS_Akshardham_New_Delhi.jpg",ScaleTypes.FIT))
        imageslide.setImageList(slide, ScaleTypes.FIT)


        val metro:CardView = findViewById(R.id.cardView2)
        metro.setOnClickListener{
            val url = "https://www.delhimetrorail.com/map"
            val customBuilder = CustomTabsIntent.Builder()
            val customTabIntent = customBuilder.build()
            customTabIntent.launchUrl(this,Uri.parse(url))
        }

        val tourism:CardView = findViewById(R.id.cardView3)
        tourism.setOnClickListener{
            val intent = Intent(this@MainActivity, Tourism::class.java)
            startActivity(intent)
        }

        val market:CardView = findViewById(R.id.cardview4)
        market.setOnClickListener{
            val intent = Intent(this@MainActivity, FamousMarkets::class.java)
            startActivity(intent)
        }

        val scrollView:ScrollView = findViewById(R.id.scrollView)
        scrollView.smoothScrollTo(0,1)
    }
}
