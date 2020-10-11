package com.example.finalfrag

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView


class adapter_list (val gamelist:ArrayList<game_list>) : RecyclerView.Adapter<adapter_list.ViewHolder>() {




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.list_layout, parent, false)
        return ViewHolder(v)


    }

    override fun getItemCount(): Int {


        return gamelist.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {


        val game_data: game_list = gamelist[position]

        holder.gametype.text = game_data.game
        holder.gameenv.text = game_data.env


    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val gametype = itemView.findViewById(R.id.text_list1) as TextView
        val gameenv = itemView.findViewById(R.id.text_list2) as TextView

    }
}