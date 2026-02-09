package oop_12345_nama.week01

// Langkah 4: Fungsi dengan Expression Body
fun calculateStatus(score: Int) = if (score > 75) "Lulus" else "Tidak Lulus"

fun main() {
    // Langkah 2: Refactoring Variables (val & String Template)
    val name = "John Thor"
    val score = 80
    println("Nama: $name, Nilai: $score")

    // Langkah 3: Control Flow (When Expression)
    val grade = when (score) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
    println("Grade kamu: $grade")

    // Langkah 4: Memanggil fungsi status
    println("Status: ${calculateStatus(score)}")

    // Langkah 5: Null Safety (Elvis Operator)
    val studentId: String? = null
    val idLength = studentId?.length ?: 0
    println("Panjang ID: $idLength")
}