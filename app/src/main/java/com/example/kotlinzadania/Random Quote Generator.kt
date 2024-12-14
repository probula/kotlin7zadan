import kotlin.random.Random

object Quotes{ //Singleton
    val quotesList = mutableListOf(
        "The pain of discipline is much less than the pain of regret. - David Goggins",
        "The only way to do great work is to love what you do. - Steve Jobs",
        "It's never too late to be what you want to be. - George Eliot",
        "Don’t count the days, make the days count. - Muhammad Ali"
    )

    fun getRandomQuote(): String{
        val randomIndex = Random.nextInt(quotesList.size)
        return quotesList[randomIndex]
    }

    fun addQuoute(){
        println("Podaj cytat jaki chcesz dodac: ")
        val cytat = readln()
        quotesList.add(cytat)
    }
}

fun main(){
    println("Czy chcesz dodać cytat do list?: wpisz 'tak' lub 'nie': ")
    val wybor = readln()

    if(wybor == "tak"){
        Quotes.addQuoute()
        println("Losuje z: " + Quotes.quotesList)
        println("Wylosowany cytat: " + Quotes.getRandomQuote())
    }
    else if(wybor == "nie"){
        println("Wylosowany cytat: " + Quotes.getRandomQuote())
    }
    else{
        println("blad!")
    }
}