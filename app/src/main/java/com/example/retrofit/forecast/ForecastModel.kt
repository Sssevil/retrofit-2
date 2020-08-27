package com.example.retrofit.forecast

 data class ForecastModel(
     val cod:String,
     val message:Int,
     val cnt:Int,
     val city:CityModel,
     val list: List<ForecastItem>

 )
