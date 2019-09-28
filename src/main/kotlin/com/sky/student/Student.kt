package com.sky.kotlin

import java.util.*

fun main() {
//    userInput()
    val stu = Student("sky", 33, 55)
    stu.print()
    println("High score: ${stu.highest()}")
}

class Student(var name:String?, var english:Int, var math:Int) {
    fun print() {
        println(name + "\t" + english + "\t" + math +
                "\t" + getAverage() + "\t" +
                if (getAverage() >= 60) "PASS" else "FAILED")
    }

    fun getAverage() : Int {
        return (english+math)/2
    }
    fun highest() : Int {
        return if (english > math) {
            println("english")
            english
        } else {
            println("math")
            math
        }
    }
    fun nameCheck() {
        println(name?.length)
    }
}
private fun userInput() {
    val scanner = Scanner(System.`in`)
    print("Please enter student's name:")
//    var name = scanner.next()
    var name = null
    print("Please enter student's english:")
    var english = scanner.nextInt()
    print("Please enter student's math:")
    var math = scanner.nextInt()
    val stu = Student(name, english, math)
    stu.print()
    stu.nameCheck()
}

