fun main() {
//    setAndListExample
//    createMapExamples()
//    checkDoubleValueInMapExample()
}

private fun checkDoubleValueInMapExample() {
    // Check temperature
    val foxiesHealthCheck = mutableMapOf<String, Double>()
    val temperatureTooHigh: Boolean
    foxiesHealthCheck["temperature"] = 32.7
    val temperature = foxiesHealthCheck["temperature"]
    temperatureTooHigh = temperature != null && temperature > 32.7
    println(temperatureTooHigh)
}

private fun createMapExamples() {
    val uniqueTransport = mapOf("Peru" to "The Boat")
    println("A unique mode of transportation that exists in Peru is ${uniqueTransport["Peru"]}.")

    val tvShows = mutableMapOf(
        "The Big Bang Theory" to 278,
        "Modern Family" to 250,
        "Bewitched" to 254,
        "That '70s Show" to 200
    )
    println(tvShows)
}

/*
- A set is an unordered Kotlin collection that stores unique elements.
- An immutable set is declared with the setOf keyword and indicates a set whose values cannot change throughout a program.
- A mutable set is declared with the mutableSetOf keyword and indicates a set whose values can be altered.
- Elements within a set can be accessed using the elementAt() or elementAtOrNull() functions.

The addAll() and add() functions are used to add elements to a collection.
The first() and last() functions return the first and last elements of a collection.
The clear() function removes all elements from a collection.
You’ve now covered the second major collection that exists in Kotlin as well as many other programming languages. Feel free to utilize the empty Review.kt file and output terminal on the right to hone your understanding of sets and practice writing Kotlin code.
 */
fun setAndListExample() {
    val uniqueParticipants = mutableSetOf<String>()
    val participants = listOf("elePHPant", "Gopher", "Lenny", "Moby Dock", "Codey", "Gopher")

    // Write your code below 🎤
    uniqueParticipants.addAll(participants)
    println("The talent show has ${uniqueParticipants.size} unique participants.")
    uniqueParticipants.clear()
    println(uniqueParticipants)
}
