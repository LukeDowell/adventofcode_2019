package dev.dowell.adventofcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Day03Test {

    @Test
    fun testCaseOne() {
        val input = "R75,D30,R83,U83,L12,D49,R71,U7,L72\n" +
                "U62,R66,U55,R34,D71,R55,D58,R83"
        val result = Day03(input).partOne

        assertEquals( 159, result)
    }

    @Test
    fun testCaseTwo() {
        val input = "R98,U47,R26,D63,R33,U87,L62,D20,R33,U53,R51\n" +
                "U98,R91,D20,R16,D67,R40,U7,R15,U6,R7"
        val result = Day03(input).partOne

        assertEquals(135, result)
    }

    @Test
    fun testCaseOne_partTwo() {
        val input = "R75,D30,R83,U83,L12,D49,R71,U7,L72\n" +
                "U62,R66,U55,R34,D71,R55,D58,R83"
        val result = Day03(input).partTwo

        assertEquals(610, result)
    }

    @Test
    fun testCaseTwo_partTwo() {
        val input = "R98,U47,R26,D63,R33,U87,L62,D20,R33,U53,R51\n" +
                "U98,R91,D20,R16,D67,R40,U7,R15,U6,R7"
        val result = Day03(input).partTwo

        assertEquals(410, result)
    }
}