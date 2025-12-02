package com.example.question_inclass
//Find the most recurring char in the input string

fun charCounter(input: String): Char? {
    if (input.isEmpty()) return null

    val repeatMap = mutableMapOf<Char, Int>()

    var maxChar: Char = input[0]
    var maxCount = 0

    for (ch in input) {
        val newCount = (repeatMap[ch] ?: 0) + 1
        repeatMap[ch] = newCount

        if (newCount > maxCount) {
            maxCount = newCount
            maxChar = ch
        }
    }

    return maxChar
}

fun main() {
    println(charCounter("mississippi"))
}