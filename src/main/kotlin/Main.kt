package org.example

fun main() {
    val dog = Dog("Pochi", 1)
    dog.cries()
}

open class Animal(val name: String) {
    fun showName() = println("name is $name")
    open fun cries() = println("")
}

class Dog(name: String, age: Int) : Animal(name) {
    init {
        println(age)
    }
    override fun cries() {
        println("bowwow")
    }
}
