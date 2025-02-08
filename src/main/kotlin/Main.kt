package org.example

fun main() {
    val human = Human()
    human.showName("Takehata")
}

class Human {
    fun showName(name: String) {
        println(name)
    }
}