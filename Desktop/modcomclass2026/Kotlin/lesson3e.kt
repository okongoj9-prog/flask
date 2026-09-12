// function with parameters
// parmeters are values that get passed as arguments when invoking a function

fun main (){
    fun sayHello(name: String){
        println("Hello $name, Hope you are good?")

    }

    sayHello("John")
    sayHello("Ken")

    println("=============")

    //below is a function that is able to calculate the BMI of a person

    fun BMI(weight : Int, height: Double){
        val answer = weight / (height * height)
        println("the BMI of the person is : $answer kg/m2")
    }

    BMI(78, 1.73)
    BMI(69, 1.56)
    
}

// By use of a function that accepts parameters, find the simple interest gained after a person invested 55000 in 4 four with a net return of 8% per year.


