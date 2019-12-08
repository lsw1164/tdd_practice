package com.lettuce.tdd_momey

class Pair {
    private var from: String
    private var to: String

    constructor(_from: String, _to: String) {
        this.from = _from
        this.to = _to
    }
    override fun equals(other: Any?): Boolean {
        var pair: Pair? = other as? Pair
        if(pair == null) return false
        return from.equals(pair.from) && to.equals(pair.to)
    }
    //TODO: modify it
    override fun hashCode(): Int {
        return 0
    }
}