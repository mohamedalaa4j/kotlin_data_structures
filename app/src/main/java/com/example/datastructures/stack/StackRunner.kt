package com.example.datastructures.stack

fun main() {
    runStack()
}

fun runStack(){
    val myStack = Stack<Char>()

    myStack.push('a')
    myStack.push('b')
    myStack.push('c')
    println("myStack $myStack")
    println("peek " + myStack.peek().toString())
    println("count " + myStack.count.toString())
    println("isEmpty " + myStack.isEmpty.toString())
    println("--------------------------")

    myStack.pop()
    println("myStack $myStack")
    println("peek " + myStack.peek().toString())
    println("count " + myStack.count.toString())
    println("isEmpty " + myStack.isEmpty.toString())
    println("--------------------------")

    myStack.pop()
    println("myStack $myStack")
    println("peek " + myStack.peek().toString())
    println("count " + myStack.count.toString())
    println("isEmpty " + myStack.isEmpty.toString())
    println("--------------------------")

    myStack.pop()
    println("myStack $myStack")
    println("peek " + myStack.peek().toString())
    println("count " + myStack.count.toString())
    println("isEmpty " + myStack.isEmpty.toString())
    println("--------------------------")
}