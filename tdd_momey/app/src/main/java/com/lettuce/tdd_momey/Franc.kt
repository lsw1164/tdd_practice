package com.lettuce.tdd_momey

class Franc : Money{
    constructor(_amount: Int, _currcnty: String) : super(_amount, _currcnty)

    override fun times(multiplier: Int): Money{
        return Money.franc(this.amount * multiplier)
    }

    override fun equals(other: Any?) : Boolean {
        if(other == null || other !is Franc) {
            return false
        }
        return other.amount == this.amount
    }
}