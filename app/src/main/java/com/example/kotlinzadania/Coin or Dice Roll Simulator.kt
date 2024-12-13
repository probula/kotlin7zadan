interface  RollingTool {
    fun roll()

}

class Coin : RollingTool{
    override fun roll() {
        val arr = arrayOf("Heads", "Tails")
        val randomArr = arr.random()
        println("Wylosowano: "+randomArr)
    }

}

class Dice : RollingTool{
        override fun roll() {
        val liczba = (1..6).random();
        println("Wylosowano: "+liczba)
    }
}

fun main(){
    println("Rzut moneta - wybierz: 1")
    println("Rzut kością - wybierz: 2")
    val wybor = readln()

    if(wybor == "1"){
        println("Wybrales: Rzut moneta")
        val coin = Coin()
        coin.roll()
    }
    else if(wybor == "2"){
        println("Wybrales: Rzut kością")
        val dice = Dice()
        dice.roll()
    }
    else{
        println("podano nieprawidłową wartość")
    }
}

