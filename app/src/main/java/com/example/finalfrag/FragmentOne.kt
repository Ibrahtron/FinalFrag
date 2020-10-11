package com.example.finalfrag

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.*


class FragmentOne : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rootview=  inflater.inflate(R.layout.fragment_one, container, false)

        val recyclerView = rootview.findViewById(R.id.recycler_view1) as RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(activity)

        val games = ArrayList<game_list>()

        games.add(game_list("Football","Outdoor"))
        games.add(game_list("Cricket","Outdoor"))
        games.add(game_list("Hockey","Outdoor"))
        games.add(game_list("Chess","Indoor"))
        games.add(game_list("Carrom","Indoor"))
        games.add(game_list("Rugby","Outdoor"))
        games.add(game_list("Tennis","Outdoor"))
        games.add(game_list("Badminton","Indoor"))
        games.add(game_list("Hand Ball","Outdoor"))
        games.add(game_list("Table Tennis","Indoor"))
        games.add(game_list("Archery","Outdoor"))
        games.add(game_list("Sumo","Indoor"))
        games.add(game_list("Snooker","Indoor"))
        games.add(game_list("Boxing","Indoor"))
        games.add(game_list("Squash","Indoor"))


        val adapt = adapter_list(games)

        recyclerView.adapter = adapt
        return rootview


    }



}
