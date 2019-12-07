package com.lettuce.tdd_momey

class Bank {
    fun reduce(source: Expression, to: String): Money {
        if(source is Money) {
           return source.reduce(to)
        }
        var sum: Sum = source as Sum
        return sum.reduce(to)
    }
}