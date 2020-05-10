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

        val countButton: Button = findViewById(R.id.countup_button)
        countButton.setOnClickListener{countUp()}
    }

        private fun rollDice(){
           // Toast.makeText(this,"Button Clicked",Toast.LENGTH_SHORT).show()
            val randomInt = (1..6).random()
            val resultText: TextView = findViewById(R.id.result_text)
            //resultText.text = getString(R.string.dice_rolled)
            resultText.text = randomInt.toString()
        }

    private fun countUp(){
        val resultText: TextView = findViewById(R.id.result_text)
        if(resultText.text == "Hello World"){
            resultText.text ="1"
        }
        else{
            var resultInt = resultText.text.toString().toInt()

            if(resultInt < 6){
                resultInt = resultInt + 1
                resultText.text = resultInt.toString()
            }

        }

    }
}
