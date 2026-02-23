package oop_12345_nama.week04

fun main() {
    println("--- Testing Vehicle & Car ---")
    val myCar = Car("Toyota", 4)
    myCar.honk()
    myCar.accelerate()

    println("\n--- Task 1: Electric Car ---")
    val myEV = ElectricCar("Tesla", 2, 90)
    myEV.accelerate()
    myEV.honk()

    println("\n--- Task 2: Employee Hierarchy ---")
    val boss = Manager("Budi", 10000000)
    val dev = Developer("Andi", 8000000, "Kotlin")

    boss.work()
    println("Bonus Manager: Rp ${boss.calculateBonus()}")

    dev.work()
    println("Bonus Developer: Rp ${dev.calculateBonus()}")
}