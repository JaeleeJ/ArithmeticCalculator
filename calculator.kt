// kotlin basic arithmetic calculator
// requirements - include some variables, expressions, conditionals,
//                loops, functions, or classes
// stretch challenge to use when keyword


import java.util.Scanner
import kotlin.math.pow
import kotlin.math.*
import kotlin.system.exitProcess

fun main() {
    // for user input
    val scanner = Scanner(System.`in`)

    // Display options
    println("Select an operation:")
    println("1. Addition")
    println("2. Subtraction")
    println("3. Multiplication")
    println("4. Division")
    println("5. Exponential Power")
    println("6. Square Root")
    println("7. Modulus")
    println("8. Factorial")
    println("9. Logarithm")
    println("10. Quit")

    // Get user choice
    print("Enter choice (1-10): ")
    val choice = scanner.nextInt()

    // quit
    if (choice == 10){
        println("Exiting. Bye!")
        exitProcess(-1)
    }


    // Get user input for two numbers for calculation
    print("Enter first number: ")
    val num1 = scanner.nextDouble()

    // square root and factorial do not need second number
    if (choice != 6 && choice != 8){
        print("Enter second number: ")
    }
    val num2 = if (choice != 6 && choice != 8) scanner.nextDouble() else 0.0

    // Perform the calculation based on user choice
    // stretch challenge to use when keyword
    when (choice) {
        // addition
        1 -> println("Result: ${num1 + num2}")
        // subtraction
        2 -> println("Result: ${num1 - num2}")
        // multiplication
        3 -> println("Result: ${num1 * num2}")
        // division
        4 -> {
            if (num2 != 0.0) {
                println("Result: ${num1 / num2}")
            // handle div/0 error and prompt for new number
            } else {
                println("Error - Cannot divide by zero.")
                print("Enter a new second number: ")
                val newNum2 = scanner.nextDouble()
                println("Result: ${num1 / newNum2}")
            }
        }
        // exponential power
        5 -> println("Result: ${num1.pow(num2)}")
        // square root
        6 -> println("Result: ${sqrt(num1)}")
        // modulus
        7 -> println("Result: ${num1 % num2}")
        // factorial
        8 -> println("Result: ${factorial(num1.toInt())}")
        // logarithm
        9 -> println("Result: ${logarithm(num1,num2)}")
        else -> println("Invalid choice. Please choose a number between 1 and 9.")
    }

    // close scanner since user input is done
    scanner.close()
}

// function to calculate factorial
// use long in case the numbers get too big
fun factorial(x:Int): Long {
    if (x <= 1) {
        return 1L
    } else {
        return x.toLong() * factorial(x - 1)
    }
}

// function to calculate logarithms
// x is the number, y is the base
fun logarithm(x: Double, y:Double): Double{
    var result = 0.0
    result = log(x, y)
    return result
}
