package org.example

fun main() {
    val id: Int = 100
    var name: String = "Takehata"
    print(countLength(name))
}

fun countLength(str: String): Int {
    return str.length
}