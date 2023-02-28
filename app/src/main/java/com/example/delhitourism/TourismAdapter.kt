package com.example.delhitourism

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.delhitourism.model.Tour


class TourismAdapter(private val context: Context, private val data:List<Tour>): RecyclerView.Adapter<TourismAdapter.TourismViewHolder>() {
    class TourismViewHolder(view: View): RecyclerView.ViewHolder(view){
        val SightName:TextView = view.findViewById(R.id.name)
        val NearMetroSt:TextView = view.findViewById(R.id.NearMetro)
        val Distance:TextView = view.findViewById(R.id.DistMetro)
        val Image:ImageView = view.findViewById(R.id.placeimage)
        val details:TextView = view.findViewById(R.id.detailsTourism)
        val constraintLayout:ConstraintLayout = view.findViewById(R.id.constraintLayout)
        val cardTourism:CardView = view.findViewById(R.id.tourCard)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TourismViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.tourism_data, parent, false)
        return TourismViewHolder(view)
    }

    override fun onBindViewHolder(holder: TourismViewHolder, position: Int) {
        val currentItem = data[position]
        holder.SightName.text = context.resources.getString(currentItem.name.toInt())
        holder.NearMetroSt.text = context.resources.getString(currentItem.NearMetro.toInt())
        holder.Distance.text = context.resources.getString(currentItem.DistMetro)
        holder.details.text = context.resources.getString(currentItem.details.toInt())
        holder.Image.setImageResource(currentItem.image)
        val isVisible:Boolean = currentItem.visibiltyTourism
        holder.constraintLayout.visibility = if(isVisible) View.VISIBLE else View.GONE

        holder.cardTourism.setOnClickListener{
            if(currentItem.visibiltyTourism==false){
                currentItem.visibiltyTourism=true
            }
            else{ currentItem.visibiltyTourism=false }
            notifyItemChanged(position)
        }
    }

    override fun getItemCount(): Int {
        return data.size
    }
}