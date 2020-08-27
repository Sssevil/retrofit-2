package com.example.retrofit

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.retrofit.forecast.ForecastItem
import kotlinx.android.synthetic.main.item_forecst.view.*

class RvAdapter:RecyclerView.Adapter<RvHolder>() {

    private val list= arrayListOf<ForecastItem>()

    override fun getItemCount()=list.size

    override fun onBindViewHolder(holder: RvHolder, position: Int) {
        holder.onBind(list[position])
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RvHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.item_forecst,parent,false)
        return RvHolder(view)
    }

    fun update (list:List<ForecastItem>?){
        if(list!=null){
            this.list.clear()
            this.list.addAll(list)
            notifyDataSetChanged()
        }

    }
}

class RvHolder(v:View):RecyclerView.ViewHolder(v){
      fun onBind(forecastItem: ForecastItem) {
          itemView.tvTitle.text=forecastItem.main.temp.toString()

      }
}