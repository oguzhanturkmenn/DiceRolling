package com.oguzhanturkmen.mydicerolling

class DiceRoll(val kenar:Int) {
    fun randomRolled():Int{
        return (1..kenar).random()
    }
}