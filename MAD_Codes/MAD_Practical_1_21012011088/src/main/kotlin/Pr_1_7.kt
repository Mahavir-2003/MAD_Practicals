//Que : Find the factorial of number by recursion. Explain "tailrec" keyword.

fun main() {
    print("Enter Number: ")
    val number = readln().toInt();

    val factorial = calculateFactorial(number)
    println("Factorial of $number = $factorial")

    val factorialTailRec = calculateFactorialTailRec(number)
    println("By TailRec Keyword, Factorial of $number = $factorialTailRec")
}

fun calculateFactorial(n: Int): Int {
    return if (n == 0 || n == 1) {
        1
    } else {
        n * calculateFactorial(n - 1)
    }
}

tailrec fun calculateFactorialTailRec(n: Int, accumulator: Int = 1): Int {
    return if (n == 0 || n == 1) {
        accumulator
    } else {
        calculateFactorialTailRec(n - 1, accumulator * n)
    }
}
