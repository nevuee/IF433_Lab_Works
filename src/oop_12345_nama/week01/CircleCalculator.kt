package oop_12345_nama.week01

// Langkah 3: Expression Body Function [cite: 383, 385, 387]
fun checkSize(area: Double) = if (area > 100) "This is a Big Circle" else "This is a Small Circle"

fun main() {
    // Langkah 2: Variables & String Templates [cite: 378, 379, 380]
    val radius = 7.0
    val pi = 3.14
    val area = pi * radius * radius

    // Langkah 2 & 4: Output dengan String Template dan Clean Up [cite: 381, 389, 392]
    println("Radius: $radius, Area: $area")
    println(checkSize(area))
}