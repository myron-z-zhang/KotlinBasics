/*fun main(args: Array<String>) {
    println("\nYour fortune is: {${getFortuneCookie()}}")
}*/

fun main(args: Array<String>) {
    var fortune: String
    for (i in 1..10) {
        fortune = getFortune(getBirthday())
        println("\nYour fortune is: $fortune")
        if (fortune.contains("Take it easy")) break;
    }
}

fun getBirthday() : Int {
    print("\nEnter your birthday: ")
    val birthday = readLine()?.toIntOrNull() ?: 1
    return birthday
}

fun getFortune(birthday : Int) : String {
    val fortune = listOf<String>("You will have a great day!"
            , "Things will go well for you today."
            , "Enjoy a wonderful day of success."
            , "Be humble and all will turn out well."
            , "Today is a good day for exercising restraint."
            , "Take it easy and enjoy life!"
            , "Treasure your friends because they are your greatest fortune.")

    val index = when (birthday) {
        in 1..7 -> 4
        28, 31 -> 2
        else -> birthday.rem(fortune.size)
    }
    return fortune[index]
}

fun getFortuneCookie() : String {
    val fortuneCookie = listOf<String>("You will have a great day!"
    , "Things will go well for you today."
    , "Enjoy a wonderful day of success."
    , "Be humble and all will turn out well."
    , "Today is a good day for exercising restraint."
    , "Take it easy and enjoy life!"
    , "Treasure your friends because they are your greatest fortune.")

    print("\nEnter your birthday: ")
    val birthday = readLine()?.toIntOrNull() ?: 1
    return fortuneCookie[birthday.rem(fortuneCookie.size)]
}