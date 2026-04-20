package oop_12345_nama.week09

fun main() {
    println("=== TEST LAMBDA ===")
    // Syntax Lambda eksplisit: { parameters -> body }
    // Membuat fungsi anonim (fungsi tanpa nama) yang ringkas
    val sumLambda = { a: Int, b: Int -> a + b }
    println("Hasil Sum: ${sumLambda(5, 10)}")

    // Lambda dengan satu parameter menggunakan implicit 'it'
    val squareImplicit: (Int) -> Int = { it * it }
    println("Hasil Square: ${squareImplicit(4)}")
}
// CHECKPOINT 4: Commit "week09: create basic lambdas using explicit and implicit syntax"


//Contoh kalo ga pake lambda
// fun sumBiasa(a: Int, b: Int): Int { -> buat dulu fungsinya
//    return a + b
//}
//
// fun main() {
//    // Memanggil fungsi biasa
//    val hasil = sumBiasa(5, 10)
//    println("Hasil Sum Biasa: $hasil")
//}