package com.example.datastructures.queue

fun main() {
    runQueue()
}

fun runQueue() {
    val myQueue = Queue<Char>()

    myQueue.enqueue('a')
    myQueue.enqueue('b')
    myQueue.enqueue('c')
    println("myQueue $myQueue")
    println("peek " + myQueue.peek().toString())
    println("count " + myQueue.count.toString())
    println("isEmpty " + myQueue.isEmpty.toString())
    println("--------------------------")

    myQueue.dequeue()
    println("myQueue $myQueue")
    println("peek " + myQueue.peek().toString())
    println("count " + myQueue.count.toString())
    println("isEmpty " + myQueue.isEmpty.toString())
    println("--------------------------")

    myQueue.dequeue()
    println("myQueue $myQueue")
    println("peek " + myQueue.peek().toString())
    println("count " + myQueue.count.toString())
    println("isEmpty " + myQueue.isEmpty.toString())
    println("--------------------------")

    myQueue.dequeue()
    println("myQueue $myQueue")
    println("peek " + myQueue.peek().toString())
    println("count " + myQueue.count.toString())
    println("isEmpty " + myQueue.isEmpty.toString())
    println("--------------------------")
}