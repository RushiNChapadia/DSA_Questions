package com.example.question_inclass

// most occurring and least occurring chars from given string

data class CharFrequencyResult(
    val mostFrequent: Set<Char>,
    val leastFrequent: Set<Char>
)

fun findMostAndLeastFrequentChars(input: String): CharFrequencyResult {
    if (input.isEmpty()) {
        return CharFrequencyResult(emptySet(), emptySet())
    }

    val freqMap = mutableMapOf<Char, Int>()
    for (ch in input) {
        freqMap[ch] = (freqMap[ch] ?: 0) + 1
    }

    var minFreq = Int.MAX_VALUE
    var maxFreq = Int.MIN_VALUE

    for ((_, count) in freqMap) {
        if (count < minFreq) minFreq = count
        if (count > maxFreq) maxFreq = count
    }

    val most = mutableSetOf<Char>()
    val least = mutableSetOf<Char>()

    for ((ch, count) in freqMap) {
        if (count == maxFreq) {
            most.add(ch)
        }
        if (count == minFreq) {
            least.add(ch)
        }
    }

    return CharFrequencyResult(mostFrequent = most, leastFrequent = least)
}

fun main(){
    val str = "hello world"
    val result = findMostAndLeastFrequentChars(str)

    println("Most occurring chars: ${result.mostFrequent}")
    println("Least occurring chars: ${result.leastFrequent}")
}