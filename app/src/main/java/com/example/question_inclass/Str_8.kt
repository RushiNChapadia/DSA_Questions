package com.example.question_inclass

// 'difference' - - 'deferred'
// 'inc'

fun removeChars(str1: String, str2: String): String {
    val removeSet = str2.toSet()

    val result = StringBuilder()
    for (ch in str1) {
        if (ch !in removeSet) {
            result.append(ch)
        }
    }

    return result.toString()

}

fun main(){
    println(removeChars("difference", "deferred"))
    println(removeChars("coffee", "co"))
}