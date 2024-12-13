import kotlin.random.Random

interface Weather{
    fun wyswietl(): String;
}

class Sunny : Weather{
    override fun wyswietl(): String {
        return "słonecznie"
    }
}

class Rainy : Weather{
    override fun wyswietl(): String {
        return "pada deszcz"
    }
}

class Clody : Weather{
    override fun wyswietl(): String {
        return "pochmurno"
    }
}

fun losujPogode() : Weather{
        return when(Random.nextInt(3)) { //losuje od 0 do 2 włącznie
            0 -> Sunny()
            1 -> Rainy()
            else -> Clody()
        }
}

data class Miasto(val nazwa: String, val pogoda: Weather)

fun main(){

    val miasta = mutableListOf(
        Miasto("olsztyn", losujPogode()),
        Miasto("warszawa", losujPogode()),
        Miasto("wrocław", losujPogode()),
        Miasto("kraków", losujPogode()),
        Miasto("poznań", losujPogode())
    )

    println("Wybierz miasto z listy: " + miasta.map { it.nazwa })
    val wybor = readln().lowercase()

    val wybraneMiasto = miasta.find { it.nazwa.lowercase() == wybor }

    if (wybraneMiasto != null) {
        println("W ${wybraneMiasto.nazwa} jest ${wybraneMiasto.pogoda.wyswietl()}")
    }
    else {
        println("$wybor nie istnieje!")
    }
}