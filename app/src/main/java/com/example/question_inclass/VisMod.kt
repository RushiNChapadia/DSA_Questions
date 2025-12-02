package com.example.question_inclass


    open class Person {
        var name: String = "Rushi"
        private var age: Int = 24
        protected var gender: String = "Male"
        internal var country: String = "US"

        fun showDetails() {
            println("Name1 $name")
            println("Age1 : $age")
            println("Gender1 : $gender")
            println("Country1: $country")
        }
    }
    class Student :Person() {
        fun showStudentDetails() {
            println("Name2: $name")
       //     println("Age2: $age")
            println("Gender2: $gender")
            println("Country2: $country")
        }
    }




    fun main() {
        val person = Person()
        person.showDetails()

        val student = Student()
        student.showStudentDetails()

        println(person.name)
        //println(person.age)
       // println(person.gender)
        println(person.country)
    }
