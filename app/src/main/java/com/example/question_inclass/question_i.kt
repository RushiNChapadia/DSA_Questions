//package com.example.question_inclass
//
////i.	Given a list of employees, where each employee is represented by a data class containing their name, a list of projects they are working on, and a map of their project names to the hours worked on each project. Write a function to perform the following tasks:
////Filter out employees who are working on less than 2 projects.
////Create a set of all unique projects across all employees.
////Create a map where the keys are project names and the values are lists of pairs. Each pair contains an employee's name and the hours they have worked on that project.
////For each project in the map, sort the list of pairs by the hours worked in descending order.
////Return a map where the keys are project names and the values are the names of the top 3 employees who worked the most hours on that project. If there are fewer than 3 employees, include all of them.
////code//
//
//data class Employee(val name: String, val projects: List<String>, val hoursWorked: Map<String, Int>)
//
//
//fun analyzeEmployeeProjects(employees: List<Employee>): Map<String, List<String>> {
//    val cond1 = employees.filter { it.projects.size >= 2 }
//
//    val cond2 = cond1.flatMap { it.projects }.toSet()
//
//    val cond3 = mutableMapOf<String, MutableList<Pair<String, Int>>>()
//
//    for(emp in cond1){
//        for ((project, hoursWorked) in emp.hoursWorked){
//
//        }
//    }
//
//    val cond4 = cond3.mapValues { entry -> entry.value.sortedBy { it.second } } }
//
//    return cond4.mapValues { entry -> entry.value.take(3) {} }
//}
//
//
//
//
