package com.valeeva.rrr.recadapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.valeeva.rrr.R

class StateRecycler (val context: Context, val list: ArrayList<state>): RecyclerView.Adapter<StateRecycler.MyVH>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StateRecycler.MyVH {
        val root = LayoutInflater.from(context).inflate(R.layout.state_adapter,parent,false)
        return MyVH(root)
    }

    class MyVH(itemView: View): RecyclerView.ViewHolder(itemView){
        val image: ImageView = itemView.findViewById(R.id.imagestate)
        val  textView: TextView = itemView.findViewById(R.id.titlestate)
        val  textViewop: TextView = itemView.findViewById(R.id.titleopstate)

    }

    override fun onBindViewHolder(holder: StateRecycler.MyVH, position: Int) {
        holder.image.setImageResource(list[position].image_state)
        holder.textView.setText(list[position].text_state)
        holder.textViewop.setText(list[position].title)
    }

    override fun getItemCount(): Int {
        return list.size
    }

}
