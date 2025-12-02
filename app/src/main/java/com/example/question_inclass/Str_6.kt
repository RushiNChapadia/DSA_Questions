package com.example.question_inclass

fun printDuplicateChars(input: String) {
    val freqMap = mutableMapOf<Char,Int>()

    for (ch in input){
        freqMap[ch] = (freqMap[ch]?:0)+1
    }
    val printed = mutableSetOf<Char>()
    for(ch in input){
        val count = freqMap[ch]?:0
        if(count>1 && printed.add(ch)){
            println("$ch -> $count times")
        }
    }
}

fun main(){
    println(printDuplicateChars("mississippi"))
    println(printDuplicateChars("bookkeeper"))

}