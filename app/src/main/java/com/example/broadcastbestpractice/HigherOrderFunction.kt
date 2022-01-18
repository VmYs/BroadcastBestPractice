package com.example.broadcastbestpractice


fun main() {
//    val num1 = 100
//    val num2 = 80
//    val result1 = num1AndNum2(num1, num2) { n1, n2 ->
//        n1 + n2
//    }
//    val result2 = num1AndNum2(num1, num2) { n1, n2 ->
//        n1 - n2
//    }
//    println("result1 is $result1")
//    println("result2 is $result2")

    println("main start")
    val str = ""
    printString(str) {s ->
        println("lambda start")
        if (s.isEmpty()) return@printString
        println(s)
        println("lambda end")
    }
    println("main end")
}

//高阶函数
//内联函数
//inline fun num1AndNum2(num1: Int, num2: Int, operation: (Int, Int) -> Int) : Int {
//    return operation(num1, num2)
//}

fun printString(str: String, block: (String) -> Unit) {
    println("printString begin")
    block(str)
    println("printString end")
}