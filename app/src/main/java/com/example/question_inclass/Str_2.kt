package com.example.question_inclass
//Count the number of occurrences of each char in the input string

fun charCount(input: String): Map<Char, Int>{
    val repeatMap = mutableMapOf<Char, Int>()

    for (ch in input){
        repeatMap[ch] = (repeatMap[ch] ?: 0) + 1
    }

    return repeatMap

}

fun main(){
    val str = "fullerton"
    val result = charCount(str)
    for ((ch,count) in result){
        println("$ch -> $count")
    }
}
