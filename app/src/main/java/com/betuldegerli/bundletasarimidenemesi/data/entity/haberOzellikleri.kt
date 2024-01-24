package com.betuldegerli.bundletasarimidenemesi.data.entity

import java.io.Serializable

data class haberOzellikleri(val haberId:Int,
                       val haberBaslik:String,
                       val haberIcerik:String,
                       val haberKanal:String,
                       val haberResimAdi:String):Serializable {
}