package com.example.diceapp

class Dice(var sides: Int = 6) {
    fun roll(): Int {
        val range = 1..sides
        return range.random()
    }
}
