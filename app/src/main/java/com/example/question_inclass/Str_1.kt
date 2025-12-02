package com.example.question_inclass

val isPalindrome1: (String) -> Boolean = { str ->
    val map = HashMap<Int, Char>()
    for (i in str.indices) {
        map[i] = str[i]
    }

    var i = 0
    var j = str.length - 1
    var found = true

    while (i < j) {
        if (map[i] != map[j]) {
            found = false
            break
        }
        i++
        j--
    }
    found
}

fun main(){
    println(isPalindrome1("racecar"))
    println(isPalindrome1("coffee"))
}
