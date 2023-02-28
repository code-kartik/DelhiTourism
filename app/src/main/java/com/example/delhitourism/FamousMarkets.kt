package com.example.delhitourism

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.delhitourism.data.DatasourceMarket

class FamousMarkets : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_famous_markets)

        supportActionBar?.setTitle("Famous Markets")

        val data = DatasourceMarket().loadData()
        val marketRecycler:RecyclerView = findViewById(R.id.marketView)
        marketRecycler.adapter = MarketAdapter(this, data)

        marketRecycler.layoutManager = LinearLayoutManager(this)
    }
}