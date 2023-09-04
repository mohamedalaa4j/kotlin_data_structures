package com.example.datastructures.queue

// Interface the support generic type of Any (non-nullable)
interface IQueue<T : Any> {

    // ------------------------------- Two properties ------------------------------- //
    val count: Int

    val isEmpty: Boolean

    // ------------------------------- Operation ------------------------------- //
    // Adds element to the queue
    fun enqueue(element: T)

    // Removes first element of the queue
    fun dequeue(): T?

    // Returns last element
    fun peek(): T?
}