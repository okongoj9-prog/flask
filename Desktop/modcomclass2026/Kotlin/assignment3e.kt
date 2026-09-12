fun main() {
    val principal = 55000.0
    val rate = 8.0 
    val time = 4.0

   
    val interest = calculateSimpleInterest(principal, rate, time)

    println("The simple interest gained is: KSh $interest")
}


fun calculateSimpleInterest(principal: Double, rate: Double, time: Double): Double {
    return (principal * rate * time) / 100
}