package com.example.diceroller   //Dated:- 10th May,2020  //Day 1 of 30daysofKotlin
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

//The namespace for the Android Jetpack libraries is androidx.

// The app:srcCompat attribute uses the Android X library to support vector drawables in older versions of Android, back to API level 7.
class MainActivity : AppCompatActivity() {

   lateinit var diceImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceImage = findViewById(R.id.dice_image)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{rollDice()}


    }

        private fun rollDice(){
            val randomInt = (1..6).random()
//            val diceImage: ImageView = findViewById(R.id.dice_image)

            val drawableResource = when (randomInt){
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }

            diceImage.setImageResource(drawableResource)

        }

}
