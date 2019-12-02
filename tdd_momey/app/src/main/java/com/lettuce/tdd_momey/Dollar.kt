package com.lettuce.tdd_momey

open class Dollar {

    var amount: Int
    constructor(_amount: Int) {
        this.amount = _amount
    }
    fun times(multiplier : Int) : Dollar {
        return Dollar(this.amount * multiplier)
    }

    override fun equals(other: Any?) : Boolean {
        if(other == null || other !is Dollar)
            return false

        return this.amount == other.amount
    }
}

