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

    //TODO: implement
    override fun plus(addend: Expression): Expression {
        //this is Dummy
        return Sum(this.augend, this.addend)
    }
}