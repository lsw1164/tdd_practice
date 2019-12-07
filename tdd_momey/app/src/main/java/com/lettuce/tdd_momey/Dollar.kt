package com.lettuce.tdd_momey

import android.text.method.MovementMethod

class Dollar : Money {
    constructor(_amount: Int, _currency: String) : super(_amount, _currency)

    override fun times(multiplier: Int) : Money{
        return Money.dollar(this.amount * multiplier)
    }

    override fun equals(other: Any?) : Boolean {
        if(other == null || other !is Dollar) {
            return false
        }
        return other.amount == this.amount
    }
}

