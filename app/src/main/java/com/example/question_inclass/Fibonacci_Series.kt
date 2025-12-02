package com.example.question_inclass

val isFibonacci: (Int) -> Boolean = { num: Int ->
    if (num < 0) false
    else {
        val fib = Array(50) { 0 }
        fib[0] = 0
        fib[1] = 1
        var found = false

        for (i in 2 until fib.size) {
            fib[i] = fib[i - 1] + fib[i - 2]
        }

        for (value in fib) {
            if (value == num) {
                found = true
                break
            }
        }
        found
    }
}
fun main() {
    println(isFibonacci(21))
    println(isFibonacci(34))
    println(isFibonacci(35))
    println(isFibonacci(55))
    println(isFibonacci(89))

}
