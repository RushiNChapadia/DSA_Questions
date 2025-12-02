package com.example.question_inclass

fun fibonacci(n: Int): Int{
    return if(n<=1){
        n
    }
    else {
        fibonacci(n-1)+fibonacci(n-2)
    }

}
fun main() {
    print("enter number of you want fibonacci no: ")
    val n = readLine()!!.toInt()

    println("fibonacci series up to $n terms is")

    for (i in 0 until n) {
        print("${fibonacci(i)} ")
    }
}