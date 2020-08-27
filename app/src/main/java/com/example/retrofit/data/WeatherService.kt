package com.example.retrofit.data

import com.example.retrofit.forecast.ForecastModel
import com.example.retrofit.model.current.CurrentWeather
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherService {
    @GET("data/2.5/weather")
    fun getWeather(
        @Query("q") city:String,
        @Query("appid") appId:String,
        @Query("units") units:String
    ):Call<CurrentWeather>

    @GET("data/2.5/forecast")
    fun getForecast(
        @Query("q") city:String,
        @Query("appid") appId:String,
        @Query("units") units:String
    ):Call<ForecastModel>
}


// data/2.5/forecast?q=Bishkek&appid=571e451823f23c308bb16efde5f126bb