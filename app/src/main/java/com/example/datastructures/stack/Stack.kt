package com.example.datastructures.stack

class Stack<T : Any> : IStack<T> {

    private val storage = arrayListOf<T>()

    override val count: Int
        get() = storage.size

    override val isEmpty: Boolean
        get() = super.isEmpty

    // Big O (1)
    override fun push(element: T) {
        storage.add(element)
    }

    // Big O (1)
    override fun pop(): T? {
        return if (isEmpty) null else storage.removeAt(storage.size - 1)
    }

    // Big O (1)
    override fun peek(): T? {
        return if (isEmpty) null else storage[storage.size - 1]
    }

    override fun toString(): String {
        return storage.toString()
    }
}

/**
Kotlin, the ArrayList class provides an implementation of a dynamic array, where elements can be added or removed.
When adding an element to an ArrayList, the time complexity is typically O(1) on average.

However, there are cases where adding an element to an ArrayList can result in a time complexity of O(n).
This occurs when the internal array of the ArrayList needs to be resized because it's already at its maximum capacity.
In such cases, the ArrayList needs to create a new array with a larger size, copy the existing elements to the new array, and then add the new element.
This process takes linear time, proportional to the number of elements in the ArrayList (n).

In general, when you add elements to an ArrayList, you can expect O(1) time complexity.
But occasionally, when the internal array needs to be resized, the time complexity becomes O(n).

The maximum capacity of the internal array in an ArrayList is determined by the underlying implementation
and may vary depending on the specific version of the Kotlin or Java runtime you are using.

In general, the default initial capacity of an ArrayList is 10.
However, the ArrayList class automatically resizes its internal array as needed when elements are added.
The resizing strategy typically involves creating a new array with a larger size and copying the existing elements to the new array.

The specific maximum capacity of an ArrayList can be influenced by factors such as available memory and the specific JVM implementation.
In practice, the maximum capacity is often limited by the amount of memory available to the JVM and the maximum array size allowed by the platform.
 **/