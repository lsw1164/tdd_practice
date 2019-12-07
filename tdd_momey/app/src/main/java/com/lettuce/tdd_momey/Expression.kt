package com.lettuce.tdd_momey

interface Expression {
    fun reduce(to: String): Money
}