// que : Type conversion: Integer to Double, String to Integer, String to Double.

fun main(args: Array<String>) {
    val i: Int = 42
    val id: Double = i.toDouble()

    val s: String = "123"
    val si: Int = s.toInt()

    val s2: String = "3.14"
    val s2d: Double = s2.toDouble()

    println("Int : $i")
    println("Converted Double Value: $id")

    println("string : $s")
    println("Converted Integer Value: $si")

    println("string: $s2")
    println("Converted Double Value: $s2d")
}
