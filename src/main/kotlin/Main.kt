package org.example

fun main() {
    val human = Human("Takehata")
    human.showName()
}

class Human(val name: String) {
    fun showName() {
        println(name)
    }
}