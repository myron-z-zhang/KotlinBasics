/*fun main(args: Array<String>) {
    println("\nYour fortune is: {${getFortuneCookie()}}")
}*/

fun main(args: Array<String>) {
    /*var fortune: String
    for (i in 1..10) {
        fortune = getFortune(getBirthday())
        println("\nYour fortune is: $fortune")
        if (fortune.contains("Take it easy")) break;
    }*/
    canAddFish(10.0, listOf(3,3,3))
    canAddFish(8.0, listOf(2,2,2), hasDecorations = false)
    canAddFish(9.0, listOf(1,1,3), 3)
    canAddFish(10.0, listOf(), 7, true)
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

fun canAddFish(tankSize: Double, currentFish: List<Int>, fishSize: Int = 2, hasDecorations: Boolean = true): Boolean {
    if (hasDecorations) {
        return (currentFish.sum() + fishSize <= tankSize * 0.8)
    } else {
        return (currentFish.sum() + fishSize <= tankSize)
    }

}