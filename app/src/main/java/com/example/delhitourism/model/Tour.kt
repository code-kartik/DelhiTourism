package com.example.delhitourism.model

import androidx.annotation.DrawableRes

data class Tour (val name:String, val NearMetro:String, val DistMetro:Int, val details:String, @DrawableRes val image: Int, var visibiltyTourism: Boolean = false)