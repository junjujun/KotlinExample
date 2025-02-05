package org.example

fun main() {
    val id: Int = 101
    var name: String = "Takehata"

    whenExample(id)
}

fun countLength(str: String): Int {
    return str.length
}

fun displayMessage(message: String): Unit {
    println(message)
}

fun whenExample(num: Int) {
    when {
        num < 100 -> {
            println("Less than 100")
        }
        num == 100 -> {
            println("Equal to 100")
        }
        else -> {
            println("Greater than 100")
        }
    }
}
