import java.util.*

fun workday(weekday: String) {
    var start = 0
    var end = 0

    when (weekday) {
        "Monday" -> {
            start = 8
            end = 12
        }
        "Tuesday", "Wednesday", "Thursday" -> {
            start = 8
            end = 18
        }
        "Friday" -> {
            start = 8
            end = 21
        }
        "Saturday" -> {
            start = 9
            end = 16
        }
        "Sunday" -> {
            start = 8
            end = 16
        }
        else -> {
            println("Error! Invalid day. Please choose a valid day")
        }

    }

    val begin: String =
        start.toString() + "AM"

    val finish: String =
        if (end > 12) {
            end -= 12
            end.toString() + "PM"
        }
        else if (end == 12) {
            end.toString() + "PM"
        }
        else {
            end.toString() + "AM"
        }

    println("Work on $weekday starts at $begin and ends at $finish")
    return
}

fun checktime(day: String, time: Int) {
    val start: Int
    val end: Int
    when (day) {
        "Monday" -> {
            start = 8
            end = 12
        }
        "Tuesday", "Wednesday", "Thursday" -> {
            start = 8
            end = 18
        }
        "Friday" -> {
            start = 8
            end = 21
        }
        "Saturday" -> {
            start = 9
            end = 16
        }
        "Sunday" -> {
            start = 8
            end = 16
        }
        else -> {
            println("Error! Invalid day. Please choose a valid day")
            return
        }
    }

    val avail = time in start..end
    if (avail) {
        println("Yes!! We are available at that time!")
    }
    else {
        println("Oh! We apologize, We're closed at that time.")
    }
    return
}


fun contact() {
    println(
        """Thank you for trusting our service!!
            |Here is our email: ahmedaribi45@gmail.com
            |Here is our phone number: +216 50 207 571
            |© Ahmed Aribi 2024. All rights reserved.
        """.trimIndent()
    )

}


fun main() {
    while (true) {
        val scan = Scanner(System.`in`)
        println(
            """Choose an option:
        1- Check working time for a weekday.
        2- Check availability at a specific time.
        3- Contact.
        4- Exit.
    """
        )

        val choice = scan.nextInt()
        scan.nextLine()
        when (choice) {
            1 -> {
                print("Enter a weekday: ")
                val weekday = scan.nextLine()
                workday(weekday)
            }

            2 -> {
                print("Enter the day: ")
                val weekday = scan.nextLine()
                print("Enter the date (00 to 23): ")
                val time = scan.nextInt()
                checktime(weekday, time)
            }

            3 -> {
                contact()
            }

            4 -> {
                println("Have a nice day!!")
                return
            }
        }
        Thread.sleep(1000)
    }
}