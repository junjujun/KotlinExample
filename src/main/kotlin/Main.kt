package org.example

fun main() {
    GreeterImpl().hello()
}

interface Greeter {
    fun hello()
}

class GreeterImpl: Greeter {
    override fun hello() {
        println("Hello.")
    }
}
