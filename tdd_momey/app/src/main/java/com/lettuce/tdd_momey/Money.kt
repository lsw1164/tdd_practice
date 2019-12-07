package com.lettuce.tdd_momey

open abstract class Money {
    protected var amount: Int
    protected var currency: String

    constructor(_amount: Int, _currcnty:String) {
        this.amount = _amount
        this.currency = _currcnty
    }

    abstract fun times(multiplier: Int): Money
    fun currency(): String{
        return this.currency
    }

    //static method
    companion object {
        @JvmStatic fun dollar(_amount: Int): Dollar {
            return Dollar(_amount, "USD")
        }
        @JvmStatic fun franc(_amount: Int): Franc {
            return Franc(_amount, "CHF")
        }
    }

}