package com.rebecca.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    var food = arrayListOf("Hamburger", "Pizza", "Mexican", "American", "Chinese" )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val decideBtn : Button = findViewById(R.id.decide_button) as Button
        val addFoodBtn : Button = findViewById(R.id.add_food_button) as Button

        val foodTV : TextView = findViewById(R.id.decide_textView) as TextView
        val newFood : EditText = findViewById(R.id.add_food_et) as EditText

        decideBtn.setOnClickListener {
            val rand = Random.nextInt(0,4)
            foodTV.setText(food.get(rand))
        }
        addFoodBtn.setOnClickListener {
            foodTV.setText(newFood.text)
        }

    }
}