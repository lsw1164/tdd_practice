package com.lettuce.tdd_momey

class Sum : Expression {
    var augend: Expression
    var addend: Expression

    constructor(_augend: Expression, _addend: Expression) {
        this.augend = _augend
        this.addend = _addend
    }

    override fun reduce(bank: Bank, to: String): Money {
        var amount: Int = augend.reduce(bank, to).amount +
                addend.reduce(bank, to).amount
        return Money(amount, to)
    }

    override fun plus(addend: Expression): Expression {
        return Sum(this, this.addend)
    }

    override fun times(multiplier: Int): Expression {
        return Sum(this.augend.times(multiplier), this.addend.times(multiplier))
    }
}