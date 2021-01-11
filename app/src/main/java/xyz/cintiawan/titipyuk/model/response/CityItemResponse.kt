package xyz.cintiawan.titipyuk.model.response

import com.google.gson.annotations.SerializedName
import xyz.cintiawan.titipyuk.model.item.CityItem

data class CityItemResponse(@SerializedName("data") val data: List<CityItem>)