package com.example.question_inclass

fun main(){
    val firstArray = arrayOf(10,20,40,55,60,34,23)
    val secondArray = arrayOf(2,34,54,23,66)

    val mergedArray = mutableListOf<Int>()

    for(i in firstArray.indices) {
        mergedArray.add(firstArray[i])
        if(i<secondArray.size){
            mergedArray.add(secondArray[i])
        }
    }
    println("Merged Array is $mergedArray")
}