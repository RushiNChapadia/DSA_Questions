package com.example.question_inclass

fun removeDuplicateChars(input: String): String{
    val seen = mutableSetOf<Char>()
    val result= StringBuilder()

    for (ch in input){
        if(seen.add(ch)){
            result.append(ch)
        }
    }
    return result.toString()

}

fun main(){
    println(removeDuplicateChars("mississippi"))
    println(removeDuplicateChars("coffee"))
}