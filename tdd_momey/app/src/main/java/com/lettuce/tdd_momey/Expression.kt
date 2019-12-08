package com.lettuce.tdd_momey

interface Expression {
    fun reduce(bank: Bank, to: String): Money
}