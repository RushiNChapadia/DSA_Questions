package com.example.question_inclass

    fun validMountainArray(arr: IntArray): Boolean {
        val n = arr.size

        if(n < 3) return false

        var i = 0

        while(i+1 < n && arr[i] < arr[i+1]){
            i++
        }

        if(i==0 || i == n-1) return false

        while(i+1 < n && arr[i] > arr[i+1]) {
            i++
        }
        return i == n-1
    }

fun main(){
    val arr = intArrayOf(0,3,5,6,4,2,1)
    val output = validMountainArray(arr)
    println(output)
}