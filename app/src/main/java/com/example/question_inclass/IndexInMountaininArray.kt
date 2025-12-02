package com.example.question_inclass

fun peakIndexInMountainArray(arr: IntArray): Int {
    var left = 0
    var right = arr.size -1

    while(left < right) {
        val mid =  left + (right-left) /2

        if(arr[mid] < arr[mid +1]){
            left =mid+1
        }
        else {
            right=mid
        }
    }
    return left
}

fun main() {
    val arr = intArrayOf(0,2,4,8,3,1)
    val output = peakIndexInMountainArray(arr)
    println(arr[output])
}



