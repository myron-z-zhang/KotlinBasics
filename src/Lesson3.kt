import java.util.*

fun main(args: Array<String>) {
    println("Hello, world!")
    dayOfWeek()
}

fun dayOfWeek() {
    println("What day is it today?")
    val days: Int = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    when (days) {
        1 -> println("Today is Sunday.")
        2 -> println("Today is Monday.")
        3 -> println("Today is Tuesday.")
        4 -> println("Today is Wednesday")
        5 -> println("Today is Thursday.")
        6 -> println("Today is Friday.")
        7 -> println("Today is Saturday.")
    }
}