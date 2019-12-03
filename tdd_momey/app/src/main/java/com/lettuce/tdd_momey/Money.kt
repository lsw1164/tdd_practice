package com.lettuce.tdd_momey

open abstract class Money {
    protected var amount: Int
    constructor(_amount: Int) {
        this.amount = _amount
    }

    abstract fun times(multiplier: Int): Money

    //static method
    companion object {
        @JvmStatic fun dollar(_amount: Int): Dollar {
            return Dollar(_amount)
        }
        @JvmStatic fun franc(_amount: Int): Franc {
            return Franc(_amount)
        }
    }

}