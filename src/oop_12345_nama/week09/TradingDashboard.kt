package oop_12345_nama.week09

fun main() {
    // Inisialisasi Data
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 50, 120.0, "CLOSED"),
        TradeLog("SOLUSDT", "LONG", 10, -12.5, "CLOSED"),
        TradeLog("ETHUSDT", "LONG", 20, 5.0, "OPEN"),
        TradeLog("BTCUSDT", "LONG", 25, -2.0, "CLOSED")
    )
    // CHECKPOINT 11: Commit "week09: (task) populate mock trade history list"

    // Pipeline 1: Filter transaksi CLOSED
    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }
    // CHECKPOINT 12: Commit "week09: (task) filter CLOSED trades only"

    // Pipeline 2: Winning Trades (ROE > 0)
    val winningTrades = closedTrades.filter { it.roe > 0 }
    // CHECKPOINT 13: Commit "week09: (task) extract winning trades using filter"

    // Pipeline 3: Losing Trades (ROE <= 0)
    val losingTrades = closedTrades.filter { it.roe <= 0 }
    // CHECKPOINT 14: Commit "week09: (task) extract losing trades using filter"

    // Pipeline 4: Analisis Profit Tertinggi
    val topPerformersString = winningTrades
        .sortedByDescending { it.roe }
        .map { "WIN [${it.pair} ${it.position}]: +${it.roe}% ROE (Lev: ${it.leverage}x)" }
    // CHECKPOINT 15: Commit "week09: (task) chain sortedByDescending and map for top performers"

    // Pipeline 5: Analisis Loss
    val worstPerformersString = losingTrades
        .sortedBy { it.roe }
        .map { "LOSS [${it.pair} ${it.position}]: ${it.roe}% ROE (Lev: ${it.leverage}x)" }
    // CHECKPOINT 16: Commit "week09: (task) chain sortedBy and map for worst performers"

    // Pipeline 6: Pasangan Koin Unik
    val uniquePairs = tradeHistory.map { it.pair }.toSet()
    // CHECKPOINT 17: Commit "week09: (task) extract unique trading pairs using map and toSet"

    // Menampilkan Dashboard
    println("=== CRYPTO TRADING DASHBOARD ===")
    topPerformersString.forEach { println(it) }
    // CHECKPOINT 18: Commit "week09: (task) print top performers using forEach"

    worstPerformersString.forEach { println(it) }
    println("\nUnique Pairs: $uniquePairs")
    // CHECKPOINT 19: Commit "week09: (task) print worst performers and unique pairs"
}
// CHECKPOINT 20: Commit "week09: (task) test full crypto trading data pipeline"