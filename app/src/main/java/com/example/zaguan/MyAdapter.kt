package com.example.zaguan

import android.content.Context
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val itemsQuesadilla:ArrayList<String>, val itemsQuesadillaDescripcion:ArrayList<String> ,val context:Context):RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    class ViewHolder(view: View):RecyclerView.ViewHolder(view){
        val tvquesadilla = view.findViewById<TextView>(R.id.tvquesadilla)
        val imgview = view.findViewById<ImageView>(R.id.imgview)
        val tvDescripcion = view.findViewById<TextView>(R.id.tvDescripcion)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvquesadilla.text = itemsQuesadilla.get(position)
        holder.tvDescripcion.text = itemsQuesadillaDescripcion.get(position)
    }

    override fun getItemCount(): Int {
        return itemsQuesadilla.size
        return itemsQuesadillaDescripcion.size
    }
}