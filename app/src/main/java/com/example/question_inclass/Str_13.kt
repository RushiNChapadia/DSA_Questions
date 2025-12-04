package com.example.question_inclass
//Program to remove the same consecutive char from the input string. E.g. input string: ssuuppperrrrr coooommpuuuuuuuuttttter output should be: super computer

fun removeConsecutiveDuplicates(input: String): String {
    if (input.isEmpty()) return ""

    val result= StringBuilder()
    result.append(input[0])

    for (i in 1 until input.length){
        val current = input[i]
        val last = result[result.length-1]

        if(current != last){
            result.append(current)
        }
    }
    return result.toString()
}

fun main(){
    val input = "sssuuuppperrr cccoooooommmmmpuuuutttteeerr"

    val output = removeConsecutiveDuplicates(input)
    println(output)
}