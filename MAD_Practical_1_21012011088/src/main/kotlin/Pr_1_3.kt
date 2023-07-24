//Que : Scan student’s information and display all the data.

fun main() {
    println("Enter Student Data:")

    println("Enrollment No.:")
    val enrollmentNo = readln()

    println("Name:")
    val name = readln()

    println("Branch:")
    val branch = readln()

    println("Class:")
    val studentClass = readln()

    println("Batch:")
    val batch = readln()

    println("College Name:")
    val collegeName = readln()

    println("University Name:")
    val universityName = readln()

    println("Age:")
    val age = readln()

    println("Displaying Student Data:")
    println("Student:")
    println("Enrollment No.: $enrollmentNo")
    println("Name: $name")
    println("Branch: $branch")
    println("Class: $studentClass")
    println("Batch: $batch")
    println("Age: $age")
    println("College Name: $collegeName")
    println("University Name: $universityName")
}
