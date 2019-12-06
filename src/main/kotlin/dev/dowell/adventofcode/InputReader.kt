package dev.dowell.adventofcode

import java.lang.RuntimeException

class InputReader(private val filename: String) {
    fun get(): String {
        return this::class.java.classLoader.getResource(filename)?.readText() ?: throw RuntimeException("Input not found!")
    }
}