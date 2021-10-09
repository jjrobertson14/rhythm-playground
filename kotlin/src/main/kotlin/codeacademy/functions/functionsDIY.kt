package main.kotlin.codeacademy.functions

fun getListOfNumbers(): List<Int> {
    val myList = mutableListOf<Int>()
    for (i in 1..7) {
        var n: Int?
        do {
            print("enter a number...")
            n = readLine()?.toIntOrNull()
        } while (n == null)
        myList.add(n)
    }
    return myList
}

fun main() {
    // Write more code below
    val values = getListOfNumbers()
    print(values)
}