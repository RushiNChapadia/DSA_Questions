package com.example.question_inclass

//Write a program to find pairs of all elements from int array having sum equal to given target sum. Write the optimized solution.

// 1,3,4,5,5    9

fun pairWithSum(arr: IntArray, targetSum: Int) {
    val pairs=mutableListOf<Pair<Int,Int>>()
    val seen=mutableSetOf<Int>()


    for (num in arr) {
        val left = targetSum-num
        if(seen.contains(left)){
            pairs.add(Pair(num,left))
        }
        seen.add(num)

        if(pairs.isEmpty()){
            println("No pairs found")
        }
        else {
            pairs.forEach { println("${it.first},${it.second}") }
        }
    }
}

fun main(){
    val arr = intArrayOf(1,2,3,4,5)
    val targetSum = 5
    pairWithSum(arr,targetSum)
}