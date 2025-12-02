package com.example.question_inclass

//University has various courses and there is eligibility criteria for each course admission as below:
//To get admission for Bachelor of Engineering (BE), candidates should have scored
//80+ marks in physics,
//80+ marks in chemistry and
//90+ marks in mathematics, overall percentage obtained in
//HSC exam should be 85+ and should score
//150+ Marks out of 200 in Engineering Entrance Exam.
//To get admission for Bachelor of Computer Applications (BCA), candidates should have scored
//70+ marks in mathematics, overall percentage obtained in
//HSC exam should be 60+ and should score
//70+ marks out of 100 in BCA Entrance exam.
//Write a Kotlin program to simulate the admission process to check if a candidate is eligible for BE and BCA admission or not. Create appropriate abstract classes, abstract methods and appropriate children classes to simulate the admission process.

abstract class Admission(val name: String, val hscMarks: Double, val entranceMarks: Int){
    abstract fun isEligible(): Boolean
    abstract fun courseName(): String
}

class BEAdmission(name: String, hscMarks: Double, entranceMarks: Int, private val physicsMarks: Int, private val chemMarks: Int, private val mathMarks: Int): Admission(name,hscMarks,entranceMarks){
    override fun isEligible(): Boolean {
        return physicsMarks>=80 && chemMarks>=80 && mathMarks>=90 && hscMarks>=85 && entranceMarks>=150
    }
    override fun courseName(): String {
        return "BE"
    }
}
class BCAAdmission(name: String, hscMarks: Double, entranceMarks: Int,private val mathMarks: Int):Admission(name,hscMarks,entranceMarks){
    override fun isEligible(): Boolean {
        return mathMarks>= 70 && hscMarks>=60 && entranceMarks>=70
    }

    override fun courseName(): String {
        return "BCA"
    }
}

fun main(){
    val students = listOf(
        BEAdmission ("rushi",90.0,180,89,99,88) ,
        BCAAdmission("jay",30.0,43,63,)
    )

    for(student in students) {
        println("${student.name} has applied for ${student.courseName()}")
        if (student.isEligible()){
            println("he is eligible for student")
        }
        else{
            println("not eligible")

    }
}}