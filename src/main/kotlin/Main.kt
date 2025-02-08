package org.example

open class Animal(val name: String) {
    init {
        println("Animal init: $name")
    }
}

class Dog(name: String, age: Int) : Animal(name) {
    val dogAge = age * 7 // プロパティの初期化
    init {
        println("Dog init: $name is $age years old.")
    }
    init {
        println("Another init block: Dog age in human years is $dogAge.")
    }
}

fun main() {
    val dog = Dog("Buddy", 3)
}
