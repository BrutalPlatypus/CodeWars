package dev.gstorm.codewars

import kotlin.math.pow

/*
My grandfather always predicted how old people would get, and right before he passed away he revealed his secret!

In honor of my grandfather's memory we will write a function using his formula!

- Take a list of ages when each of your great-grandparent died.
- Multiply each number by itself.
- Add them all together.
- Take the square root of the result.
- Divide by two.
 */

fun predictAge(age1: Int, age2: Int, age3: Int, age4: Int, age5: Int, age6: Int, age7: Int, age8: Int): Int {
    val ages = intArrayOf(age1, age2, age3, age4, age5, age6, age7, age8)
    return (ages.map { it * it }.sum().toDouble().pow(0.5) / 2).toInt()
}