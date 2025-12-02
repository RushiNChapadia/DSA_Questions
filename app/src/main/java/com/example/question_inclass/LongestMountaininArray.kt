package com.example.question_inclass

 fun longestMountain(arr: IntArray): Int {
        val n = arr.size
        if (n < 3) return 0

        var longest = 0
        var i = 1

        while (i < n - 1) {
            if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) {
                var left = i - 1
                var right = i + 1

                while (left > 0 && arr[left - 1] < arr[left]) {
                    left--
                }
                while (right < n - 1 && arr[right] > arr[right + 1]) {
                    right++
                }

                longest = maxOf(longest, right - left + 1)
                i = right
            } else {
                i++
            }
        }

        return longest
    }

fun main() {
    val arr = intArrayOf(4,0,2,4,5,6,8,3,1)
    val output = longestMountain(arr)
    println(output)
}