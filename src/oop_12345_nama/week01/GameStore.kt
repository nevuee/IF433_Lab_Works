package oop_12345_nama.week01

// Langkah 2: Logika Diskon (Expression Body) [cite: 408, 409]
fun calculateDiscount(price: Int): Int = if (price > 500000) (price * 0.2).toInt() else (price * 0.1).toInt()

// Langkah 3: Cetak Struk (Named Arguments) [cite: 412]
fun printReceipt(title: String, originalPrice: Int, finalPrice: Int, userNote: String?) {
    println("--- STRUK PEMBELIAN STEAMKW ---")
    println("Judul Game  : $title")
    println("Harga Asli  : Rp $originalPrice")
    println("Harga Akhir : Rp $finalPrice")
    // Langkah 4: Null Safety untuk Catatan [cite: 416, 418]
    println("Catatan     : ${userNote ?: "Tidak ada catatan"}")
}

fun main() {
    // Langkah 1: Persiapan Data [cite: 405]
    val gameTitle = "Elden Ring"
    val price = 600000
    val userNote: String? = null

    val discount = calculateDiscount(price)
    val finalPrice = price - discount

    // Langkah 3: Memanggil dengan Named Arguments [cite: 413]
    printReceipt(
        title = gameTitle,
        originalPrice = price,
        finalPrice = finalPrice,
        userNote = userNote
    )
}