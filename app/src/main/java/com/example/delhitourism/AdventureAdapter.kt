package com.example.delhitourism

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.delhitourism.model.AdventureModel

class AdventureAdapter(val context: Context, val data:List<AdventureModel>):RecyclerView.Adapter<AdventureAdapter.AdventureViewHolder>() {
    class AdventureViewHolder(val view: View):RecyclerView.ViewHolder(view) {
        val ActivityName:TextView = view.findViewById(R.id.activity_name)
        val ActivityNearSt:TextView = view.findViewById(R.id.activity_near_st)
        val ActivityDistance:TextView = view.findViewById(R.id.activity_dist)
        val ActivityImage:ImageView = view.findViewById(R.id.activity_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdventureViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.adventure_data,parent,false)
        return AdventureViewHolder(view)
    }

    override fun onBindViewHolder(holder: AdventureViewHolder, position: Int) {
        val currentItem = data[position]
        holder.ActivityName.text = context.resources.getString(currentItem.activityName.toInt())
        holder.ActivityNearSt.text = context.resources.getString(currentItem.activityNearMetro.toInt())
        holder.ActivityDistance.text = context.resources.getString(currentItem.activityLocation.toInt())
        holder.ActivityImage.setImageResource(currentItem.activityImage)
    }

    override fun getItemCount(): Int {
        return data.size
    }
}