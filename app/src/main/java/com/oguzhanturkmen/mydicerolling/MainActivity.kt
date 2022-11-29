package com.oguzhanturkmen.mydicerolling

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        clickedButton()
    }

    fun clickedButton(){
        diceRolled.setOnClickListener {
            firstDiceRolled()
            secondDiceRolled()
        }

    }
    fun firstDiceRolled(){
        val firstRandom = DiceRoll(6)
        val result = firstRandom.randomRolled()
        val drawableResource = when(result){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        firstDice.setImageResource(drawableResource)
    }

    fun secondDiceRolled(){
        val secondRandom = SecondDiceRoll(6)
        val result = secondRandom.randomRolled2()
        val drawableResource = when(result){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        secondDice.setImageResource(drawableResource)
    }

}