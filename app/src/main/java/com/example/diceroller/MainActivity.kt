package com.example.diceroller   //Dated:- 10th May,2020  //Day 1 of 30daysofKotlin
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{rollDice()}
    }
    val randomInt = (1..6).random()
        private fun rollDice(){
           // Toast.makeText(this,"Button Clicked",Toast.LENGTH_SHORT).show()
            val resultText: TextView = findViewById(R.id.result_text)
            //resultText.text = getString(R.string.dice_rolled)
            resultText.text = randomInt.toString()
        }
}
