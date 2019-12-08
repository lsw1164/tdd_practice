package com.lettuce.tdd_momey

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Test
    fun testMultipication() {
        var five: Money = Money.dollar(5)
        assertEquals(Money.dollar(10), five.times(2))
        assertEquals(Money.dollar(15), five.times(3))
    }

    @Test
    fun testEquality() {
        assertTrue(Money.dollar(5).equals(Money.dollar(5)))
        assertFalse(Money.dollar(5).equals(Money.dollar(6)))
        assertFalse(Money.dollar(5).equals(Money.franc(5)))
    }

    @Test
    fun testFrancMultipication() {
        var five : Money = Money.franc(5)
        assertEquals(Money.franc(10), five.times(2))
        assertEquals(Money.franc(15), five.times(3))
    }

    @Test
    fun testCurrency() {
        assertEquals("USD", Money.dollar(1).currency())
        assertEquals("CHF", Money.franc(1).currency())
    }

    @Test
    fun testSimpleAddition() {
        var five: Money = Money.dollar(5)
        var sum: Expression = five.plus(five)
        var bank: Bank = Bank()
        var reduced: Money = bank.reduce(sum, "USD")
        assertEquals(Money.dollar(10), reduced)
    }

    @Test
    fun testPlusReturnsSum() {
        var five: Money = Money.dollar(5)
        var result: Expression = five.plus(five)
        var sum: Sum? = result as? Sum
        assertEquals(five, sum?.addend)
        assertEquals(five, sum?.augend)
    }

    @Test
    fun testReduceSum() {
        var sum: Expression = Sum(Money.dollar(3), Money.dollar(4))
        var bank: Bank = Bank()
        var result = bank.reduce(sum, "USD")
        assertEquals(Money.dollar(7), result)
    }

    @Test
    fun testReduceMoney() {
        var bank: Bank = Bank()
        var result: Money = bank.reduce(Money.dollar(1), "USD")
        assertEquals(Money.dollar(1), result)
    }

    @Test
    fun testReduceMoneyDifferentCurrency() {
        var bank: Bank = Bank()
        bank.addRate("CHF", "USD", 2)
        var result: Money = bank.reduce(Money.franc(2), "USD")
        assertEquals(Money.dollar(1), result)
    }

    @Test
    fun testIdentityRate() {
        assertEquals(1, Bank().rate("USD", "USD"))
    }

}

