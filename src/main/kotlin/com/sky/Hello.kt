package com.sky

fun main() {
    var s:String? = "abcde"
    s = null
    println(s?.length)
    println(s?.get(3))
    println(s?.substring(3))
//    println("Hello World")
//    Human().hello()
    val h = Human()
    h.hello()
}

class Human {
    fun hello() {
        println("Hello kotlin")
    }
}