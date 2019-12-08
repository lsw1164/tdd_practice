package com.lettuce.tdd_momey

import kotlin.math.absoluteValue

class Bank {
    private var rates: HashMap<Pair, Int?> = HashMap()

    fun reduce(source: Expression, to: String): Money {
        return source.reduce(this, to)
    }

    fun rate(from: String, to: String): Int {
        if(from.equals(to)) return 1
        var rate: Int? = this.rates.get(Pair(from, to))
        if(rate == null) return 1
        else return rate.toInt()
    }

    fun addRate(from: String, to: String, rate: Int) {
        this.rates.put(Pair(from, to), rate)
    }
}