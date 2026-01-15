package com.example.question_inclass
// Check whether two strings are anagram of each other

fun areAnagrams(s1: String, s2: String): Boolean{
    if(s1.length != s2.length) return false

    val freq = mutableMapOf<Char, Int>()

    for (ch in s1){
        freq[ch] = (freq[ch] ?: 0) + 1
    }

    for (ch in s2){
        val count = freq[ch] ?: return false
        if (count == 1){
            freq.remove(ch)
        } else {
            freq[ch] = count - 1
        }
    }
    return freq.isEmpty()
}

fun main(){
    println(areAnagrams("listen", "silent"))
    println(areAnagrams("hello", "world"))
    println(areAnagrams("heart", "earth"))
    println(areAnagrams("abc", "def"))

}