package com.example.question_inclass

fun reverseEachWord(input: String): String {
    val chars = input.toCharArray()
    val n = chars.size
    var i =0

    while (i<n){
        if(chars[i]==' '){
            i++
        } else{
            val start = i
            var end = i

            while (end < n && chars[end] != ' '){
                end++
            }

            var left = start
            var right = end -1
            while(left<right){
                val temp = chars[left]
                chars[left]=chars[right]
                chars[right]=temp
                left++
                right--
            }
            i=end

        }
    }
    return String(chars)

}

fun main(){
    val input = "Sun rises in East"
    val output = reverseEachWord(input)
    println(output)
}