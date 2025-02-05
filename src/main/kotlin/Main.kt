package org.example

fun main() {
    for (i in 1..10) {
        println("i is $i")
    }

    for (i in 1 until 10 step 2) {
        println("i is $i")
    }

    val list = listOf(1, 2, 5, 6, 10)
    for (i in list) {
        println("i is $i")
    }
}

