package com.example.question_inclass

fun firstNonRepeatingChar(input: String): Char?{
    if(input.isEmpty()) return null

    val freqMap = mutableMapOf<Char, Int>()
    for(ch in input){
        freqMap[ch]= (freqMap[ch] ?: 0 )+1
    }

    for (ch in input){
        if(freqMap[ch]==1){
            return ch
        }
    }
    return null

}

fun main(){
    println(firstNonRepeatingChar("ruusshhi"))
    println(firstNonRepeatingChar("sself"))
}