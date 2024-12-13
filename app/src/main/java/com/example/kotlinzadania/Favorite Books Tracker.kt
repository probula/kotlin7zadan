class Program {
    val ksiazki = mutableListOf("")

    fun dodaj() {
        while (true) {
            println("\npodaj nazwe ksiazki, autora, oraz rok wydania, lub wpisz 'koniec' aby zakonczyc dodawanie: ")
            val ksiazka = readln()

            if (ksiazka.lowercase() == "koniec") {
                break
            } else {
                ksiazki.add(ksiazka)
                println("Twoja lista zawiera ksiazki: " + ksiazki)
                sortuj()
            }
        }
    }

    fun filtrujRok() {
        println("Podaj rok z ktorego maja byc ksiazki")
        val rok = readln()
        println(ksiazki.filter { rKsiazki -> rKsiazki.contains(rok) })

    }

    fun filtrujAutora() {
        println("Podaj jakiego autora maja byc ksiazki")
        val autor = readln().lowercase()
        println(ksiazki.filter { aKsiazki -> aKsiazki.contains(autor) })
    }

    fun sortuj() {
        ksiazki.sortBy { it.substringBefore(",").trim() }
        println("Posortowane książki alfabetycznie po tytule: $ksiazki")
    }
}

fun main(){
    val program = Program()

    program.dodaj()
    program.filtrujAutora()
    program.filtrujRok()
    program.sortuj()
}