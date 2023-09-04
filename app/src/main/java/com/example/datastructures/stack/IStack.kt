package com.example.datastructures.stack

// Interface the support generic type of Any (non-nullable)
interface IStack<T : Any> {

    // ------------------------------- Two properties ------------------------------- //
    val count: Int

    val isEmpty: Boolean get() = count == 0


    // ------------------------------- Operation ------------------------------- //
    // Adds element to top
    fun push(element: T)

    // Removes last element
    fun pop(): T?

    // Returns last element
    fun peek(): T?
}