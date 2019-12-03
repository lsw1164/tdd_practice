package com.lettuce.tdd_momey

import android.text.method.MovementMethod

class Dollar : Money {
    constructor(_amount: Int) : super(_amount)

    fun times(multiplier : Int) : Dollar {
        return Dollar(this.amount * multiplier)
    }
    override fun equals(other: Any?) : Boolean {
        if(other == null || other !is Dollar) {
            return false
        }
        return other.amount == this.amount
    }
}

