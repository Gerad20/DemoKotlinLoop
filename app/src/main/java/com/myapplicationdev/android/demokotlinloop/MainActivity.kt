package com.myapplicationdev.android.demokotlinloop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        count.setOnClickListener {
            for (i in 1..5){
                Log.d("Main Activity", "$i")
            }
            var e =  0
            while(e < 6){
                Log.d("Main Activity2", "$e")
                e++
            }
        }

        letterCount.setOnClickListener {
            var wordChosen = word.text.toString()

            for (letter in wordChosen){
                Log.d("Yes letter", "$letter")
            }
        }
}
}