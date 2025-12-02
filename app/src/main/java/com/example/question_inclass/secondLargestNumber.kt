package com.example.question_inclass

val secondLargest: (Array<Int>) -> Int? = { arr ->
    if (arr.size < 2) null
    else {
        var first = Int.MIN_VALUE
        var second = Int.MIN_VALUE

        for (num in arr) {
            if (num > first) {
                second = first
                first = num
            } else if (num > second && num != first) {
                second = num
            }
        }
        if (second == Int.MIN_VALUE) null else second
    }
}
fun main() {
    val arr = arrayOf(12, 35, 1, 10, 34, 1)

    val result = secondLargest(arr)
    println(result)
}
