package com.example.delhitourism

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.delhitourism.data.DatasourceAdventure

class Adventure : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adventure)

        supportActionBar?.setTitle("Adventures")

        val data = DatasourceAdventure().loadData()
        val adventureRecycleView:RecyclerView = findViewById(R.id.AdventureRecycler)
        adventureRecycleView.adapter = AdventureAdapter(this, data)

        adventureRecycleView.layoutManager = LinearLayoutManager(this)
    }
}