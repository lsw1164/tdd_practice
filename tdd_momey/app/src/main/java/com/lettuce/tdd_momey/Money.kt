package com.lettuce.tdd_momey

class Money {
    var amount: Int
    var currency: String

    constructor(_amount: Int, _currcnty:String) {
        this.amount = _amount
        this.currency = _currcnty
    }

    override fun toString(): String {
        return this.amount.toString() + " " + this.currency
    }

    fun times(multiplier: Int): Money? {
        return Money(this.amount * multiplier, this.currency)
    }

    fun currency(): String {
        return this.currency
    }

    override fun equals(other: Any?): Boolean {
        var otherMoney: Money? = other as? Money
        if(otherMoney == null) return false
        return (this.amount == otherMoney.amount
                && this.currency() == otherMoney.currency())
    }

    //static method
    companion object {
        @JvmStatic fun dollar(_amount: Int): Money {
            return Money(_amount, "USD")
        }
        @JvmStatic fun franc(_amount: Int): Money{
            return Money(_amount, "CHF")
        }
    }

}