package com.example.question_inclass

//k.	Write a program to find wellformedness of parenthesis for a given mathematical expression. In a wellformed mathematical expression,
//i.	All opening brackets like (, {, [ should have their corresponding closing brackets like ), }, ]
//ii.	No closing bracket should appear before its opening bracket.
//iii.	The most recent opening bracket should have its corresponding closing.

fun isWellformedness(exp: String): Boolean {
    var count1 = 0
    var count3 = 0
    var count2 = 0
    for(ch in exp){
        when(ch){
            '[' -> count1++
            ']' -> count1--
            '{' -> count2++
            '}' -> count2--
            '(' -> count3++
            ')' -> count3--
        }
        if(count1<0 || count2<0 || count3<0) return false
    }
    return count1==0 && count2==0 && count3==0
}


fun main() {
    println(isWellformedness("[{a+b}]"))
    println(isWellformedness("[[]asd})"))
}
