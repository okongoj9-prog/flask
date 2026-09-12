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
    
