class sportsResultAnalyzer{

    var wyniki = mutableListOf<Int>()

    fun dodajWynik(){
        println("Podaj wynik meczu: ")
        val wynik = readln().toIntOrNull()
        if(wynik != null){
            wyniki.add(wynik)
            println("Dodano wynik: $wynik")
        }
        else{
            println("Błędny wynik!")
        }
    }

    fun menu(){
        while (true){
            println("\nWybierz opcję:")
            println("1. Dodaj wynik meczu")

            when(readln().toIntOrNull()) {
                1 -> dodajWynik()

                else -> println("Błąd!")
            }
        }
    }
}
fun main(){
    val analyzer = sportsResultAnalyzer()
    analyzer.menu()
}