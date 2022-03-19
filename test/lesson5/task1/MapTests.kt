package lesson5.task1

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class MapTests {

    @Test
    fun findSumOfTwo() {
        assertEquals(
            Pair(-1, -1),
            findSumOfTwo(emptyList(), 1)
        )
        assertEquals(
            Pair(-1, -1),
            findSumOfTwo(listOf(1), 2)
        )
        assertEquals(
            Pair(-1, -1),
            findSumOfTwo(listOf(1), 1)
        )
        assertEquals(
            Pair(-1, -1),
            findSumOfTwo(listOf(1, 5, 7), 2)
        )
        assertEquals(
            Pair(0, 3),
            findSumOfTwo(listOf(1, 3, 2, 6, 5), 7)
        )
        assertEquals(
            Pair(0, 1),
            findSumOfTwo(listOf(1, 1, 1, 1), 2)
        )
    }
}