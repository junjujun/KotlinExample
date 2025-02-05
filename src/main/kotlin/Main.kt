package org.example

fun main() {
    val id: Int = 100
    var name: String = "Takehata"
    displayMessage(name)
}

fun countLength(str: String): Int {
    return str.length
}

fun displayMessage(message: String): Unit {
    println(message)
}