import java.util.*

fun main() {
    val input = Scanner(System.`in`)
    val amount = input.nextDouble()

    var cents = (amount * 100 + 0.5).toInt()

    val notes = listOf(10000, 5000, 2000, 1000, 500, 200)

    println("NOTAS:")
    for (note in notes) {
        //val noteValue = note * 100
        val count = cents / note
        println("$count nota(s) de R$ ${note / 100}.00")
        cents %= note
    }

    println("MOEDAS:")
    val coins = listOf(100, 50, 25, 10, 5, 1)
    for (coin in coins) {
        val count = cents / coin
        println("$count moeda(s) de R$ ${"%.2f".format(coin / 100.0)}")
        cents %= coin
    }
}