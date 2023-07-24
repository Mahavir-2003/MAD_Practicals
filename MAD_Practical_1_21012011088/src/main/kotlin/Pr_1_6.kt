//Que : By using a user defined function perform all arithmetic operations.

fun main() {
    val number1 = 11
    val number2 = 22

    performOperation("Addition", number1, number2)
    performOperation("Subtraction", number1, number2)
    performOperation("Multiplication", number1, number2)
    performOperation("Division", number2, number1)
    performOperation("Additional Subtraction", number1, number2)
}

fun performOperation(operation: String, num1: Int, num2: Int) {
    val result = when (operation) {
        "Addition" -> num1 + num2
        "Subtraction" -> num1 - num2
        "Multiplication" -> num1 * num2
        "Division" -> num2 / num1
        else -> null
    }

    println("$operation of $num1, $num2 is ${result ?: "Invalid operation"}")
}
