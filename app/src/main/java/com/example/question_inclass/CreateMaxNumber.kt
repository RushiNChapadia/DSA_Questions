package com.example.question_inclass

//Kotlin program for Given a list of non-negative integers nums, arrange them such that they form the largest number and return it.
//
//Input: nums = [10,2]
//
//Output: "210"
//
//Input: nums = [3,30,34,5,9]

//Output: "9534330"

class Sol{
    fun maxNumber(nums: IntArray): String{
        val array = nums.map { it.toString() }.toMutableList()
        array.sortWith { x,y ->
            (y+x).compareTo(x+y)
        }
        if (array[0]=="0") return "0"

        return buildString {
            for (num in array) append(num)
        }
    }
}
fun main(){
    val solution = Sol()
    println(solution.maxNumber(intArrayOf(10,2)))
    println(solution.maxNumber(intArrayOf(0)))
    println(solution.maxNumber(intArrayOf(3,30,34,5,9)))

}