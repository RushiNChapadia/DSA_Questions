package com.example.question_inclass


fun areRotations(str1: String, str2: String): Boolean {
    if (str1.length != str2.length) return false


    if(str1.isEmpty() && str2.isEmpty()){
        return true
    }

    val concat = str1 + str1
    return concat.contains(str2)
}


fun main(){
    println(areRotations("qwerty","ertyqw"))
}