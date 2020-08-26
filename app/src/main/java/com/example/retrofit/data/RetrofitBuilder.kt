package com.example.retrofit.data


import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitBuilder {
    private var service:WeatherService?=null

     fun getService():WeatherService?{
         if(service == null)
             service = buildRetrofit()

         return service

     }

    private fun buildRetrofit():WeatherService{

        return Retrofit.Builder()
            .baseUrl("http://api.openweathermap.org/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(WeatherService::class.java)
    }

  //  http://api.openweathermap.org/data/2.5/weather?q=Bishkek&appid=571e451823f23c308bb16efde5f126bb
}