package com.example.gdsc_myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var myButton : Button
    lateinit var myCounter : TextView

    var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        Toast.makeText(this, "J is awesome", Toast.LENGTH_SHORT).show()

        setContentView(R.layout.activity_main)
        myButton = findViewById(R.id.my_button)
        myCounter = findViewById(R.id.count)

        initButtons()
    }

    fun initButtons() {
        myButton.setOnClickListener() {
            ++count
            myCounter.text = count.toString()
        }
    }

    override fun onStart() {
        super.onStart()

        Toast.makeText(this, "Start", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()

        Toast.makeText(this, "Resumed", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()

        Toast.makeText(this, "Pause", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()

        Toast.makeText(this, "Stop", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()

        Toast.makeText(this, "Destroyed", Toast.LENGTH_SHORT).show()
    }
}

