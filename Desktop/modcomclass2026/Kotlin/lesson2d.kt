fun main() {
    // when conditional statement
    // The when statement is like a switch case whereby, if a condition is met  acertian case, the statements gets printed out otherwise if no condition is met , it defualts tothe else block

    val marks = 52

    when(marks) {
        in 1 .. 30 -> println("You failed")
        in 31 .. 50 -> println("You have average")
        in 51 .. 70 -> println("You are above average")
        in 70 .. 100 -> println("Execellent")
        else -> println("Invalid scores")
    }
}

// research and create 2 programs for loopnig statements i.e one for "for loop"  and another for "while loop"