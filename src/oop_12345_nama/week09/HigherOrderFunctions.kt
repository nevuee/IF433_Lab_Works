package oop_12345_nama.week09

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8)
    println("Original Data: $numbers")

    println("\n=== HOF: FILTER ===")
    // filter() mengambil elemen yang memenuhi kondisi true
    val evens = numbers.filter { it % 2 == 0 }
    println("Evens only: $evens")
    // CHECKPOINT 5: Commit "week09: implement filter HOF to extract data"

    println("\n=== HOF: MAP ===")
    // map() mentransformasi nilai data
    val multiplied = evens.map { it * 10 }
    val asStrings = multiplied.map { "Rp ${it}k" }
    println("Multiplied: $multiplied")
    println("Formatted: $asStrings")
    // CHECKPOINT 7: Commit "week09: implement sortedByDescending and forEach"
}