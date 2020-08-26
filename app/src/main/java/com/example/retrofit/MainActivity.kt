package com.example.retrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.retrofit.data.RetrofitBuilder
import com.example.retrofit.model.CurrentWeather
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Response
import retrofit2.Callback


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        RetrofitBuilder.getService()
            ?.getWeather("Bishkek","571e451823f23c308bb16efde5f126bb")
            ?.enqueue(object :Callback<CurrentWeather>{
                override fun onResponse(
                    call: Call<CurrentWeather>,
                    response: Response<CurrentWeather>
                ) {
                   if(response.isSuccessful && response.body() == null){
                       val data=response.body()
                       weather.text=data?.wind?.speed.toString()
                   }
                }

                override fun onFailure(call: Call<CurrentWeather>, t: Throwable) {
                   Log.d("sjkCNkjcns","kJNSXKJnJK")
                }
            })
    }
}