package oop_12345_nama.week09

fun main() {
    // --- LANGKAH 1: List & Mutabilitas ---
    println("=== TEST LIST ===")
    // Immutable List: Read-Only
    val frameworks: List<String> = listOf("Kotlin", "Java", "C++")
    // frameworks.add("Python") // Akan ERROR jika di-uncomment
    println("Immutable List: $frameworks")

    // Mutable List: Bisa ditambah/dikurangi
    val scores: MutableList<Int> = mutableListOf(85, 98)
    scores.add(95) // -> ini yang dibilang mutable
    scores[0] = 88
    println("Mutable List: $scores")

    // CHECKPOINT 1: Commit "week09: create immutable and mutable list"

    // --- LANGKAH 2: Set (Keunikan Data) ---
    println("\n=== TEST SET ===")
    val uniqueNumbers = setOf(1, 2, 2, 3, 3, 4)
    println("Unique Numbers (Set): $uniqueNumbers") // Duplikat otomatis hilang

    val activeUsers = mutableSetOf("UserA", "UserB")
    activeUsers.add("UserC")
    activeUsers.add("UserA") // Diabaikan karena sudah ada
    println("Active Users: $activeUsers")
    // CHECKPOINT 2: Commit "week09: implement set to discard duplicate elements"

    // --- LANGKAH 3: Map (Key-Value Pairs) ---
    println("\n=== TEST MAP ===")
    val studentGrades = mapOf(
        "Alice" to "A",
        "Bob" to "B",
        "Charlie" to "A" // Key unik, Value boleh duplikat
    )
    println("Nilai Bob: ${studentGrades["Bob"]}")

    val inventory = mutableMapOf("Apples" to 50, "Bananas" to 30)
    inventory["Oranges"] = 20 // Menambah data baru
    inventory["Apples"] = 45  // Mengupdate data lama
    println("Inventory: $inventory")
    // CHECKPOINT 3: Commit "week09: implement map for key-value storage"
}