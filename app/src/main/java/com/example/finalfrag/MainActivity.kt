package com.example.finalfrag

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener {
        val intent_button = Intent(this, FragLayout::class.java)
            intent_button.putExtra("fargment_value", "1" )
            startActivity(intent_button)
        }
        button2.setOnClickListener {
            val intent_button = Intent(this, FragLayout::class.java)
            intent_button.putExtra("fargment_value", "2" )
            startActivity(intent_button)
        }
        button3.setOnClickListener {
            val intent_button = Intent(this, FragLayout::class.java)
            intent_button.putExtra("fargment_value", "3" )
            startActivity(intent_button)
        }
        button4.setOnClickListener {
            val intent_button = Intent(this, FragLayout::class.java)
            intent_button.putExtra("fargment_value", "4" )
            startActivity(intent_button)
        }

    }
}