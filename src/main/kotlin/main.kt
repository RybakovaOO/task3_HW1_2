fun main(){
    val itemPrice = 100
    val itemCount = 15
    val discount1 = 100
    val discount2 = 5
    val discount3 = 1
    val discountStart = 1000
    val discountEnd = 10000
    val regularUser = true

    var amount = itemPrice * itemCount
    if (amount > discountStart && amount <= discountEnd){
        amount -= discount1
    }
    else if (amount > discountEnd){
        amount -= amount * discount2/100
    }
    else amount
    val result = if (regularUser == true) amount-(amount*discount3/100) else amount
    println("Сумма вашей покупки: $result")
}