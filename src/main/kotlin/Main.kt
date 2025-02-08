package org.example

fun main() {
    val androidPlatform = AndroidPlatform()
    androidPlatform.showName()

    IosPlatform().showName()

}

sealed class Platform {
    abstract fun showName()
}

class AndroidPlatform: Platform() {
    override fun showName() {
        println("Android.")
    }
}

class IosPlatform: Platform() {
    override fun showName() {
        println("iOS.")
    }
}
