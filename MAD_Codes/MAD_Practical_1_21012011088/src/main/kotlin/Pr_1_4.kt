//Que : Find the number is odd or even by using Control Flow inside println() method.

fun main() {
    print("Enter a Number : ")
    val number = readln().toInt();
    println("The number $number is ${if (number % 2 == 0) "even" else "odd"}.")
}
