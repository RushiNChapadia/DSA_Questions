package com.example.question_inclass

fun mergeTwoSortedArr(arr1: Array<Int>, arr2: Array<Int>): Array<Int>{
    val mergedList = mutableListOf<Int>()
    var i=0
    var j=0

    while(i<arr1.size && j<arr2.size) {

        if (arr1[i] < arr2[j]){
            mergedList.add(arr1[i])
            i++
        }
        else{
            mergedList.add(arr2[j])
            j++
        }
    }
    while(i<arr1.size){
        mergedList.add(arr1[i])
        i++
    }
    while (j<arr2.size){
        mergedList.add(arr2[j])
        j++
    }
    return mergedList.toTypedArray()
}

fun main(){
    val firstArray = arrayOf(10, 28, 50, 75, 80, 95, 100)
    val secondArray = arrayOf(35, 60, 70, 78)

    val mergedArray = mergeTwoSortedArr(firstArray, secondArray)
    println("Merged Sorted Array: ${mergedArray.joinToString(", ")}")
}