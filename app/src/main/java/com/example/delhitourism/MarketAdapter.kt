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
import com.example.delhitourism.model.MarketModel

class MarketAdapter(val context: Context, val data:List<MarketModel>): RecyclerView.Adapter<MarketAdapter.MarketViewHolder>() {
    class MarketViewHolder(val view: View):RecyclerView.ViewHolder(view){
        val Name: TextView = view.findViewById(R.id.marketName)
        val details:TextView = view.findViewById(R.id.details)
        val constraintlayout:ConstraintLayout = view.findViewById(R.id.constraint)
        val card:CardView = view.findViewById(R.id.marketCard)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MarketViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.market_data,parent,false)
        return MarketViewHolder(view)
    }

    override fun onBindViewHolder(holder: MarketViewHolder, position: Int) {
        val currentPos = data[position]
        holder.Name.text = context.resources.getString(currentPos.marketName.toInt())
        holder.details.text = context.resources.getString(currentPos.detail.toInt())
        val isVisible:Boolean = currentPos.visibility
        holder.constraintlayout.visibility = if(isVisible) View.VISIBLE else View.GONE

        holder.card.setOnClickListener{
            if(currentPos.visibility == false){
                currentPos.visibility = true
            }
            else{ currentPos.visibility = false }
            notifyItemChanged(position)
        }

    }

    override fun getItemCount(): Int {
        return data.size
    }
}