fun main() {
    val countPurchase = 20 // количество позиций по чеку
    val price = 100 //цена единицы
    val purchase = countPurchase * price
    val customerIsRegular = true

    val discount = when {
        (purchase > 10_001) -> (purchase) * 5 / 100
        (purchase > 1_001) -> 100
        else -> 0
    }
    val total = when (customerIsRegular) {
        true -> ((countPurchase * price) - discount) - (((countPurchase * price) - discount) * 0.01)
        false -> (countPurchase * price) - discount
    }

    println("Total price $total rub")
}