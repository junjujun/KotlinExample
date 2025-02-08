package org.example

open class Animal(val name: String) {
    init {
        println("Animal init: $name")
    }
}

class Dog(name: String) : Animal(name) {
    var dogAge: Int

    // セカンダリコンストラクタ
    constructor(name: String, age: Int) : this(name) {
        this.dogAge = age * 7
        println("$name is $age years old. (Human age: $dogAge)")
    }

    init {
        dogAge = 0 // プライマリコンストラクタ用のデフォルト値
        println("Dog init block")
    }
}

fun main() {
    val dog1 = Dog("Buddy")            // プライマリコンストラクタ使用
    val dog2 = Dog("Charlie", 3)       // セカンダリコンストラクタ使用
}
