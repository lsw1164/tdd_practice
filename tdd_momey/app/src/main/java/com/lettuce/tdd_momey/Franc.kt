package com.lettuce.tdd_momey

class Franc : Money{
    constructor(_amount: Int) : super(_amount)

    fun times(multiplier: Int): Franc {
        return Franc(this.amount * multiplier)
    }
    override fun equals(other: Any?) : Boolean {
        if(other == null || other !is Franc) {
            return false
        }
        return other.amount == this.amount
    }
}