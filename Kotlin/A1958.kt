/* Contest: Kotlin Heroes Episode 10
   Problem: A. 1-3-5
   tags: Special Problem, DP, 1100
*/

import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    var t = scan.nextInt()
    var inter = 0..t-1
    for (x in inter) {
        var n = scan.nextInt()
        if (n > 7) println(0)
        else {
            when(n) {
                0,3,5,6 -> {
                    println(0)
                }
                1, 4, 7 -> {
                    println(1)
                }
                2 -> {
                    println(2)
                }
            }
        }
    }

    return;
}

/* This is the first program I write in Kotlin and Submit in Codeforces!! (Accepted) */
