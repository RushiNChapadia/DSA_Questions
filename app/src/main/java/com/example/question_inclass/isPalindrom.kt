package com.example.question_inclass
import java.util.Scanner

val isPalindrome: (String) -> Boolean = { str ->
    val map = HashMap<Int, Char>()
    for (i in str.indices) {
        map[i]=str[i]
    }

    var i=0
    var j= str.length - 1
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
fun main() {
    println(isPalindrome("rushi"))
    println(isPalindrome("racecar"))
    println(isPalindrome("rar"))
}

