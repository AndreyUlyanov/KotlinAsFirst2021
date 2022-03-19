package lesson6.task1

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ParseTests {

    @Test
    fun twoDigitStr() {
        assertEquals("00", twoDigitStr(0))
        assertEquals("09", twoDigitStr(9))
        assertEquals("10", twoDigitStr(10))
        assertEquals("24", twoDigitStr(24))
        assertEquals("35", twoDigitStr(35))
        assertEquals("68", twoDigitStr(68))
        assertEquals("99", twoDigitStr(99))
    }

}