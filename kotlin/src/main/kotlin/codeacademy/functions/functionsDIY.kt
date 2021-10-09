package main.kotlin.codeacademy.functions

import java.lang.Exception

fun main() {
    val values = getListOfNumbers()
    println("Your input values: $values")

    val largestValue = findMax(values)
    println("The largest number is $largestValue")

    val smallestValue = findMin(values)
    println("The smallest number is $smallestValue")

    val average = findMean(values)
    println("The average is $average")

    val largestDifference = findLargestDifference(values)
    println("The largest difference between values in the list is $largestDifference")

    val squareList = squareList(values)
    println("The list with all values squared: $squareList")

    var numToFind: Long?
    do {
        println("Enter a number to find in your list ($values)")
        numToFind = readLine()?.toLongOrNull()
    } while (numToFind == null)

    val containsValue = checkIfListContains(values, numToFind)
    if (containsValue) println("The value of $numToFind exists within your list ($values)")
    else println("The value of $numToFind does not exist within your list: ($values)")

    println("\nPress enter/return...")
    readLine()
}

fun getListOfNumbers(): List<Long> {
    val myList = mutableListOf<Long>()
    for (i in 1..7) {
        var n: Long?
        do {
            print("Enter a number...")
            n = readLine()?.toLongOrNull()
        } while (n == null)
        myList.add(n)
    }
    return myList
}

fun findMax(list: List<Long>): Long {
    if (list.isEmpty()) { throw Exception() }
    var largestNumber = list[0]
    for (n in list) {
        when { n > largestNumber -> largestNumber = n }
    }
    return largestNumber
}

fun findMin(list: List<Long>): Long {
    if (list.isEmpty()) { throw Exception() }
    var smallestNumber = list[0]
    for (n in list) {
        when { n < smallestNumber -> smallestNumber = n }
    }
    return smallestNumber
}

fun findMean(list: List<Long>): Double {
    if (list.isEmpty()) { throw Exception() }
    var sum = 0.0
    list.forEach { sum += it }
    return sum / list.size
}

fun checkIfListContains(list: List<Long>, value: Long): Boolean {
    if (list.isEmpty()) { throw Exception() }
    for (n in list) {
        if (n == value) return true
    }
    return false
}

fun findLargestDifference(list: List<Long>): Long {
    if (list.isEmpty()) { throw Exception() }
    return findMax(list) - findMin(list)
}

fun squareList(list: List<Long>): List<Long> {
    if (list.isEmpty()) { throw Exception() }
    return list.map { value -> value * value }
}