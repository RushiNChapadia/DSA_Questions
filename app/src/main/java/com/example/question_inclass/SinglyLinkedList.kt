package com.example.question_inclass

class Node(var data: Int) {
    var next: Node? = null
}

class SinglyLinkedList{
    private var head: Node? = null

    fun insert(data: Int) {
        val newNode = Node(data)
        if (head == null) {
            head = newNode
            return
        }
        var temp = head
        while (temp?.next != null) {
            temp = temp.next
        }
        temp?.next = newNode
    }

    fun printList() {
        var temp = head
        print("List: ")
        while(temp != null){
            print("${temp.data} -> ")
            temp=temp.next
        }
        println("null")
    }


    //  Print list in reverse (non-recursive)
    fun printReverseRecursive(node: Node? = head) {
        if (node == null) return
        printReverseRecursive(node.next)
        print("${node.data} ")
    }

    //  Print list in reverse (non-recursive)
    fun printReverseNonRecursive() {
        val stack = mutableListOf<Int>()
        var temp = head
        while (temp != null) {
            stack.add(temp.data)
            temp = temp.next
        }
        println("Reverse (non-recursive): ${stack.reversed()}")
    }

    // 4) Delete by position (1-based index)
    fun deleteAtPosition(position: Int) {
        if (head == null) return
        if (position == 1) {
            head = head?.next
            return
        }
        var temp = head
        for (i in 1 until position - 1) {
            if (temp?.next == null) return
            temp = temp.next
        }
        temp?.next = temp?.next?.next
    }
}

// Example usage
fun main() {
    val list = SinglyLinkedList()
    list.insert(10)
    list.insert(20)
    list.insert(30)
    list.printList()
    print("Reverse (recursive): ")
    list.printReverseRecursive()
    println()
    list.printReverseNonRecursive()
    list.deleteAtPosition(2)
    list.printList()
}




