fun main(){
    // koltin while loop
    // The while loop executes a piece of code aslong the condition is true
    // Syntax of the while loop : initializing a varible with some values , while keywors, condition is chexked the body of the while loop  finally increment/decrement


    var count = 0

    while (count <= 10){
        println("The number is: $count")

        count = count + 1
    }

    println("=============")
    // below is an examples of a decrement
     var countDown = 50

     while (countDown >= 15){
        println("The number is: $countDown")

        countDown = countDown - 1
     }

     println("===================")
    // by the use of the while loop create a program that is able to find the leap years btwn 2000 and 2030

    
    var year = 2000
    val endYear = 2030

    println("Leap years between $year and $endYear:")

    while (year <= endYear) {
        // A year is a leap year if it is divisible by 4
        // For century years (ending in 00), it must also be divisible by 400
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            println(year)
        }
        year++
    }
}


