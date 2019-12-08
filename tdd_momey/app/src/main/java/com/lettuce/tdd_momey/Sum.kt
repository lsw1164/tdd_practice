package com.lettuce.tdd_momey

class Sum : Expression {
    var augend: Money
    var addend: Money

    constructor(_augend: Money, _addend: Money) {
        this.augend = _augend
        this.addend = _addend
    }

    override fun reduce(bank: Bank, to: String): Money {
        var amount: Int = augend.amount + addend.amount
        return Money(amount, to)
    }
}