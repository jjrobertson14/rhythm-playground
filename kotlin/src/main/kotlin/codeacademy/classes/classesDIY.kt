package main.kotlin.codeacademy.classes

class Calculator(name: String) {
    init {
        println("Owner of calculator is $name")
    }

    fun add(x: Int, y: Int): Int {
        return x + y
    }

    fun subtract(x: Int, y: Int): Int {
        return x - y
    }

    fun multiply(x: Int, y: Int): Int {
        return x * y
    }

    fun divide(numerator: Int, denominator: Int): Int {
        if (denominator == 0) throw RuntimeException("Attempted to divide by 0, value of denominator must not be 0")
        return numerator / denominator
    }

    fun power(x: Int, exponent: Int): Int {
        var result = 1
        for (i in 1..exponent) {
            result *= x
        }
        return result
    }
}

fun main() {
    val calc = Calculator("Codey")
    println("9 + 7 \t= ${calc.add(9, 7)}")
    println("9 - 14 \t= ${calc.subtract(9, 14)}")
    println("9 * 7 \t= ${calc.multiply(9, 7)}")
    println("9 / 3 \t= ${calc.divide(9, 3)}")
    println("9^3 \t= ${calc.power(9, 3)}")
}