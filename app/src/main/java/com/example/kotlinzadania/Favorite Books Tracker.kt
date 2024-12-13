class dodajKsiazke{
    fun dodaj() {
        while(true) {
            println("podaj nazwe ksiazi, autora, oraz rok wydania: ")
            val ksiazka = readln()

            if(ksiazka == "end"){
                break
            }
            else {
                val ksiazki = mutableListOf(
                    "Harry Potter i Kamień Filozoficzny - autor: J.K. Rowling, rok wydania: 2002"
                )
                ksiazki.add(ksiazka)
                println("Twoja lista zawiera ksiazki: " + ksiazki)
            }
        }
    }

    fun filtruj(){

    }

}



fun main(){
    val dodajks = dodajKsiazke()
    dodajks.dodaj()
}