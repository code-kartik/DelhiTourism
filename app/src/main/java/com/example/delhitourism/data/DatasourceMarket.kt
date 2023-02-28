package com.example.delhitourism.data

import com.example.delhitourism.R
import com.example.delhitourism.model.MarketModel

class DatasourceMarket {
    fun loadData(): List<MarketModel>{
        return listOf(
            MarketModel(R.string.MarketName1.toString(), R.string.Details1.toString(), R.drawable.sarojini_market,false),
            MarketModel(R.string.MarketName2.toString(), R.string.Details2.toString(), R.drawable.sarojini_market,false),
            MarketModel(R.string.MarketName3.toString(), R.string.Details3.toString(), R.drawable.sarojini_market,false),
            MarketModel(R.string.MarketName4.toString(), R.string.Details4.toString(), R.drawable.sarojini_market,false),
            MarketModel(R.string.MarketName5.toString(), R.string.Details5.toString(), R.drawable.sarojini_market,false),
            MarketModel(R.string.MarketName6.toString(), R.string.Details6.toString(), R.drawable.sarojini_market,false),
            MarketModel(R.string.MarketName7.toString(), R.string.Details7.toString(), R.drawable.sarojini_market,false),
            MarketModel(R.string.MarketName8.toString(), R.string.Details8.toString(), R.drawable.sarojini_market,false),
            MarketModel(R.string.MarketName9.toString(), R.string.Details9.toString(), R.drawable.sarojini_market,false),
            MarketModel(R.string.MarketName10.toString(), R.string.Details10.toString(), R.drawable.sarojini_market,false),
            MarketModel(R.string.MarketName11.toString(), R.string.Details11.toString(), R.drawable.sarojini_market,false),
            MarketModel(R.string.MarketName12.toString(), R.string.Details12.toString(), R.drawable.sarojini_market,false),
            MarketModel(R.string.MarketName13.toString(), R.string.Details13.toString(), R.drawable.sarojini_market,false)
        )
    }
}