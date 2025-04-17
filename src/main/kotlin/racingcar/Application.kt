package racingcar
import camp.nextstep.edu.missionutils.Console

fun main() {
    // TODO: Implement the program

    //1. get inputs of player names - readCarNames()





    //2. get inputs of rounds

    //3. function: make random result

    //4. print racing result (player names, random function)

    //5. calculate who wins

    //6. print winner
}

fun readCarNames(): List<String>? {
    println("Enter the names of the cars (comma-separated):")
    val input = Console.readLine()

    val carNames = input.split(",").map { it.trim() }

    if (carNames.isEmpty() || carNames.any { it.isEmpty() }) {
        throw IllegalArgumentException("It can't be empty.")
    }

    if (carNames.size < 2) {
        throw IllegalArgumentException("At least two cars are required.")
    }

    if (carNames.any { it.length > 5 }) {
        throw IllegalArgumentException("Only up to 5characters are allowed.")
    }

    return carNames
}
