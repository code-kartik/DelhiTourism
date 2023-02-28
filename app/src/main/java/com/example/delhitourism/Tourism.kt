package com.example.delhitourism

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.delhitourism.data.Datasource


class Tourism : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tourism)

        supportActionBar?.setTitle("Tourism")

        val data = Datasource().loadData()
        val recyclerView: RecyclerView = findViewById(R.id.RecyclerView)

        recyclerView.adapter = TourismAdapter(this, data)

        recyclerView.layoutManager = LinearLayoutManager(this)

    }
}
