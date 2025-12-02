package com.example.question_inclass

fun String.removeDuplicates(): String {
    val seen = mutableSetOf<Char>()
    val result = StringBuilder()

    for (ch in this) {
        if (ch !in seen) {
            seen.add(ch)
            result.append(ch)
        }
    }
    return result.toString()
}
fun main() {
    val input = "coffee"
    val output = input.removeDuplicates()
    println(output)
}