@file:Suppress("UNUSED_PARAMETER")

package lesson3.task1

import kotlin.math.sqrt

// Урок 3: циклы
// Максимальное количество баллов = 9
// Рекомендуемое количество баллов = 7
// Вместе с предыдущими уроками = 16/21

/**
 * Пример
 *
 * Вычисление факториала
 */
fun factorial(n: Int): Double {
    var result = 1.0
    for (i in 1..n) {
        result = result * i // Please do not fix in master
    }
    return result
}

/**
 * Пример
 *
 * Проверка числа на простоту -- результат true, если число простое
 */
fun isPrime(n: Int): Boolean {
    if (n < 2) return false
    if (n == 2) return true
    if (n % 2 == 0) return false
    for (m in 3..sqrt(n.toDouble()).toInt() step 2) {
        if (n % m == 0) return false
    }
    return true
}

/**
 * Пример
 *
 * Проверка числа на совершенность -- результат true, если число совершенное
 */
fun isPerfect(n: Int): Boolean {
    var sum = 1
    for (m in 2..n / 2) {
        if (n % m > 0) continue
        sum += m
        if (sum > n) break
    }
    return sum == n
}

/**
 * Пример
 *
 * Найти число вхождений цифры m в число n
 */
fun digitCountInNumber(n: Int, m: Int): Int =
    when {
        n == m -> 1
        n < 10 -> 0
        else -> digitCountInNumber(n / 10, m) + digitCountInNumber(n % 10, m)
    }

/**
 * Простая (2 балла)
 *
 * Найти количество цифр в заданном числе n.
 * Например, число 1 содержит 1 цифру, 456 -- 3 цифры, 65536 -- 5 цифр.
 *
 * Использовать операции со строками в этой задаче запрещается.
 */
fun digitNumber(n: Int): Int {
    var counter = 0
    var number = n
    if (number == 0 || number == 1) counter = 1
    else {
        if (number > 2) {
            while (number > 0) {
                counter += 1
                number /= 10
            }
        }
    }

    return counter
}

/**
 * Простая (2 балла)
 *
 * Найти число Фибоначчи из ряда 1, 1, 2, 3, 5, 8, 13, 21, ... с номером n.
 * Ряд Фибоначчи определён следующим образом: fib(1) = 1, fib(2) = 1, fib(n+2) = fib(n) + fib(n+1)
 */
fun fib(n: Int): Int = TODO()

/**
 * Простая (2 балла)
 *
 * Для заданного числа n > 1 найти минимальный делитель, превышающий 1
 */

fun minDivisor(n: Int): Int {
    var divider = 1
    for (i in 2..n) {
        if (n % i == 0) {
            divider = i
            break
        } else continue
    }
    return divider
}

/**
 * Простая (2 балла)
 *
 * Для заданного числа n > 1 найти максимальный делитель, меньший n
 */
fun maxDivisor(n: Int): Int {
    var divider = 1
    for (i in 1 until n) {
        if (n % i == 0) {
            divider = i
        } else continue
    }
    return divider
}

/**
 * Простая (2 балла)
 *
 * Гипотеза Коллатца. Рекуррентная последовательность чисел задана следующим образом:
 *
 *   ЕСЛИ (X четное)
 *     Xслед = X /2
 *   ИНАЧЕ
 *     Xслед = 3 * X + 1
 *
 * например
 *   15 46 23 70 35 106 53 160 80 40 20 10 5 16 8 4 2 1 4 2 1 4 2 1 ...
 * Данная последовательность рано или поздно встречает X == 1.
 * Написать функцию, которая находит, сколько шагов требуется для
 * этого для какого-либо начального X > 0.
 */
fun collatzSteps(x: Int): Int = TODO()

/**
 * Средняя (3 балла)
 *
 * Для заданных чисел m и n найти наименьшее общее кратное, то есть,
 * минимальное число k, которое делится и на m и на n без остатка
 */
fun lcm(m: Int, n: Int): Int = TODO()

/**
 * Средняя (3 балла)
 *
 * Определить, являются ли два заданных числа m и n взаимно простыми.
 * Взаимно простые числа не имеют общих делителей, кроме 1.
 * Например, 25 и 49 взаимно простые, а 6 и 8 -- нет.
 */
fun isCoPrime(m: Int, n: Int): Boolean = TODO()

/**
 * Средняя (3 балла)
 *
 * Поменять порядок цифр заданного числа n на обратный: 13478 -> 87431.
 *
 * Использовать операции со строками в этой задаче запрещается.
 */
fun revert(n: Int): Int {
    var sequence = 0
    var digit: Int = n
    while (digit > 0) {
        sequence = sequence * 10 + digit % 10
        digit /= 10
    }
    return sequence
}

/**
 * Средняя (3 балла)
 *
 * Проверить, является ли заданное число n палиндромом:
 * первая цифра равна последней, вторая -- предпоследней и так далее.
 * 15751 -- палиндром, 3653 -- нет.
 *
 * Использовать операции со строками в этой задаче запрещается.
 */
fun isPalindrome(n: Int): Boolean = TODO()

/**
 * Средняя (3 балла)
 *
 * Для заданного числа n определить, содержит ли оно различающиеся цифры.
 * Например, 54 и 323 состоят из разных цифр, а 111 и 0 из одинаковых.
 *
 * Использовать операции со строками в этой задаче запрещается.
 */
fun hasDifferentDigits(n: Int): Boolean = TODO()

/**
 * Средняя (4 балла)
 *
 * Для заданного x рассчитать с заданной точностью eps
 * sin(x) = x - x^3 / 3! + x^5 / 5! - x^7 / 7! + ...
 * Нужную точность считать достигнутой, если очередной член ряда меньше eps по модулю.
 * Подумайте, как добиться более быстрой сходимости ряда при больших значениях x.
 * Использовать kotlin.math.sin и другие стандартные реализации функции синуса в этой задаче запрещается.
 */
fun sin(x: Double, eps: Double): Double = TODO()

/**
 * Средняя (4 балла)
 *
 * Для заданного x рассчитать с заданной точностью eps
 * cos(x) = 1 - x^2 / 2! + x^4 / 4! - x^6 / 6! + ...
 * Нужную точность считать достигнутой, если очередной член ряда меньше eps по модулю
 * Подумайте, как добиться более быстрой сходимости ряда при больших значениях x.
 * Использовать kotlin.math.cos и другие стандартные реализации функции косинуса в этой задаче запрещается.
 */
fun cos(x: Double, eps: Double): Double = TODO()

/**
 * Сложная (4 балла)
 *
 * Найти n-ю цифру последовательности из квадратов целых чисел:
 * 149162536496481100121144...
 * Например, 2-я цифра равна 4, 7-я 5, 12-я 6.
 *
 * Использовать операции со строками в этой задаче запрещается.
 */
fun squareSequenceDigit(n: Int): Int {
    var ordinal: Int = 0
    val number: Int = n
    var sequenceLength: Int = 0
    var counter1: Int = 3
    var counter2: Int = 9
    var counter3: Int = 31
    var counter4: Int = 99
    var counter5: Int = 316
    when (number) {
        in 1..3 -> {
            ordinal = number * number
        }
        in 4..15 -> {
            sequenceLength = 3
            while (sequenceLength < number) {
                sequenceLength += 2
                counter1 += 1
            }
            ordinal = if (sequenceLength == number) {
                counter1 * counter1 % 10
            } else counter1 * counter1 % 100 / 10
        }
        in 16..81 -> {
            sequenceLength = 15
            while (sequenceLength < number) {
                sequenceLength += 3
                counter2 += 1
            }
            ordinal = if (sequenceLength == number) {
                counter2 * counter2 % 10
            } else if (sequenceLength - number == 1) {
                counter2 * counter2 % 100 / 10
            } else counter2 * counter2 % 1000 / 100
        }
        in 82..353 -> {
            sequenceLength = 81
            while (sequenceLength < number) {
                sequenceLength += 4
                counter3 += 1
            }
            ordinal = if (sequenceLength == number) {
                counter3 * counter3 % 10
            } else if (sequenceLength - number == 1) {
                counter3 * counter3 % 100 / 10
            } else if (sequenceLength - number == 2) {
                counter3 * counter3 % 1000 / 100
            } else counter3 * counter3 % 10000 / 1000
        }
        in 354..848 -> {
            sequenceLength = 353
            while (sequenceLength < number) {
                sequenceLength += 5
                counter4 += 1
            }
            ordinal = if (sequenceLength == number) {
                counter4 * counter4 % 10
            } else if (sequenceLength - number == 1) {
                counter4 * counter4 % 100 / 10
            } else if (sequenceLength - number == 2) {
                counter4 * counter4 % 1000 / 100
            } else if (sequenceLength - number == 3) {
                counter4 * counter4 % 10000 / 1000
            } else counter4 * counter4 % 100000 / 10000
        }
        in 849..4098 -> {
            sequenceLength = 848
            while (sequenceLength < number) {
                sequenceLength += 6
                counter5 += 1
            }
            ordinal = if (sequenceLength == number) {
                counter5 * counter5 % 10
            } else if (sequenceLength - number == 1) {
                counter5 * counter5 % 100 / 10
            } else if (sequenceLength - number == 2) {
                counter5 * counter5 % 1000 / 100
            } else if (sequenceLength - number == 3) {
                counter5 * counter5 % 10000 / 1000
            } else if (sequenceLength - number == 4) {
                counter5 * counter5 % 100000 / 10000
            } else counter5 * counter5 % 1000000 / 100000
        }
    }
    return ordinal
}

/**
 * Сложная (5 баллов)
 *
 * Найти n-ю цифру последовательности из чисел Фибоначчи (см. функцию fib выше):
 * 1123581321345589144...
 * Например, 2-я цифра равна 1, 9-я 2, 14-я 5.
 *
 * Использовать операции со строками в этой задаче запрещается.
 */
fun fibSequenceDigit(n: Int): Int = TODO()