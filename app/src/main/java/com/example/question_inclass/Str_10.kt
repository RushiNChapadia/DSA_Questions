package com.example.question_inclass

import java.util.Collections.swap

fun printPermutations(str: String) {
    if (str.isEmpty()) return

    val chars=str.toCharArray()
    permute(chars,0)
}

private fun permute(chars: CharArray,index: Int){
    if(index==chars.size-1){
        println(String(chars))
        return
    }

    val used = mutableSetOf<Char>()

    for (i in index until chars.size){
        if(chars[i] in used) continue
        used.add(chars[i])

        swap(chars,index,i)
        permute(chars,index+1)
        swap(chars,index,i)

    }
}
private fun swap(chars: CharArray,i: Int,j: Int){
    val temp=chars[i]
    chars[i]=chars[j]
    chars[j]=temp
}

fun main(){
    printPermutations("wxyz")
}