package com.oguzhanturkmen.mydicerolling

class SecondDiceRoll(val kenar:Int) {
    fun randomRolled2():Int{
        return (1..kenar).random()
    }
}