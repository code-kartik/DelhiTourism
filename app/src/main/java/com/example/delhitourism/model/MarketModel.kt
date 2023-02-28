package com.example.delhitourism.model

import androidx.annotation.DrawableRes

data class MarketModel(val marketName:String, val detail:String, @DrawableRes var marketImage:Int , var visibility:Boolean = false)