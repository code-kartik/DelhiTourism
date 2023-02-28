package com.example.delhitourism.data

import com.example.delhitourism.R
import com.example.delhitourism.model.AdventureModel

class DatasourceAdventure {
    fun loadData():List<AdventureModel>{
        return listOf(
            AdventureModel(R.string.Adventure1.toString(), R.string.Loc1.toString(), R.string.NearSt1.toString(), R.drawable.india_gate)
        )
    }
}