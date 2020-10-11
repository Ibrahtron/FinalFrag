package com.example.finalfrag

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FragLayout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frag_layout)


        val firstFrag = FragmentOne()
        val secondFrag = FragmentTwo()
        val thirdFrag = FragmentThree()
        val fourthFrag = FragmentFour()


        val fragment_val =intent.getStringExtra("fargment_value")

        when(fragment_val) {
            "1" ->  supportFragmentManager.beginTransaction().apply {
                    replace(R.id.fraglayout_fragment, firstFrag)
                    commit()
                addToBackStack(null)



            }
            "2" ->  supportFragmentManager.beginTransaction().apply {
                replace(R.id.fraglayout_fragment, secondFrag)
                addToBackStack(null)
                commit()

            }
            "3" ->  supportFragmentManager.beginTransaction().apply {
                replace(R.id.fraglayout_fragment, thirdFrag)
                addToBackStack(null)
                commit()

            }
            "4" ->  supportFragmentManager.beginTransaction().apply {
                replace(R.id.fraglayout_fragment, fourthFrag)
                addToBackStack(null)
                commit()

            }
            else -> {}
        }
    }
}