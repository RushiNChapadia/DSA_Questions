package com.example.question_inclass

fun longestWordInString(sentence: String): String{
    var maxWordStart = -1
    var maxWordLen = 0
    var currentStart = -1
    var currentLen =0

    for (i in sentence.indices) {
        val ch = sentence[i]

        if(ch != ' '){
            if(currentStart == -1){
                currentStart = i
            }
            currentLen++
        } else{
            if(currentStart != -1){
                if(currentLen>maxWordLen){
                    maxWordLen=currentLen
                    maxWordStart=currentStart
                }

                currentStart=-1
                currentLen=0
            }
        }
    }

    if(currentStart != -1 && currentLen>maxWordLen){
        maxWordLen=currentLen
        maxWordStart=currentStart
    }

    return if(maxWordStart == -1) ""
        else sentence.substring(maxWordStart,maxWordStart+maxWordLen)

}

fun main(){
    println(longestWordInString("Chicago has very beautiful downtown"))
}