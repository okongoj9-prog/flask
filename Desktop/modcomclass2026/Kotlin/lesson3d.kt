fun main(){
    // below are additional examples of functions

    fun addition(){
        val number1 = 20
        val number2 = 10

        val sum = number1 + number2
        println("The sum of the number is: $sum")
    }

    // invoke
    addition()

    println("==================")
    // create a function that is able to find the product of 3 random number

    fun product(){
        val numb = 20
        val numb2 = 10
        val numb3 = 5


        val multiple = numb * numb2 * numb3
        println("The product of the number is: $multiple")
    }
    product()
    

    // given 2 numbers create afunction that is able to find the largest and the smallest of the numbers

    fun main() {
        val num1 = 25
        val num2 = 42

        findMinMax(num1,num2)
    }

    fun findMinMax(a: Int, b: Int){
        if(a==b){
            println("Both numbers are equal: $a")
            return
        }
        val max = if (a > b) a else b
        val min = if (a < b) a else b

        println("The largest number is: $max")
        println("The smallest number is: $min")
    }
    
}