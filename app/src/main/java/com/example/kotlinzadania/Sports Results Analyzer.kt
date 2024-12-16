class sportsResultAnalyzer{

    var wyniki = mutableListOf<Int>()

    fun dodajWynik(){
        println("Podaj wynik meczu:")
        val wynik = readln().toIntOrNull()
        if(wynik != null){
            wyniki.add(wynik)
            println("Dodano wynik: $wynik")
        }
        else{
            println("Błędny wynik!")
        }
    }

    fun wynikPowyzejProgu(){
        println("Podaj próg:")
        val prog = readln().toIntOrNull()
        if(prog != null) {
            val powyzejProgu = wyniki.filter { it > prog }
            println("Wyniki powyżej $prog: $powyzejProgu")
        }else{
            println("Błąd!")
        }
    }

    fun bonusowePunkty(){
        println("Podaj liczbę punktów do dodania do każdego wyniku:")
        val bonus = readln().toIntOrNull()
        if(bonus != null) {
            wyniki = wyniki.map { it + bonus }.toMutableList()
            println("Dodano $bonus puntów do każdego wyniku.")
        }else{
            println("Błąd")
        }
    }

    fun sumaWynikow(){
        val suma = wyniki.sum()
        println("Suma wszystkich wyników: $suma")
    }

    fun maksWynik(){
        val maks = wyniki.maxOrNull()
        println("Maksymalny wynik: $maks")
    }

    fun roznicaMaksMin(){
        val maks = wyniki.maxOrNull()
        val min = wyniki.minOrNull()
        if (maks != null) {
            println("Różnica pomiędzy maksymalnym a minimalnym wynikiem: ${maks - min!!}")
        }else{
            println("Błąd!")
        }
    }

    fun liczbaMeczyPowyzejProgu() {
        println("Podaj próg:")
        val prog = readln().toIntOrNull()
        if (prog != null) {
            val liczbaWynikow = wyniki.count { it > prog }
            println("Liczba meczy powyżej $prog punktów: $liczbaWynikow")
        } else {
            println("Błąd!")
        }
    }

    fun menu(){
        while (true){
            println("\nWybierz opcję:")
            println("1. Dodaj wynik meczu")
            println("2. Pokaż wynik powyżej progu")
            println("3. Dodaj bonusowe punkty do wyników")
            println("4. Oblicz sumę wyników")
            println("5. Znajdź maksymalny wynik")
            println("6. Oblicz różnice pomiedzy maksymalnym a minimalnym wynikiem")
            println("7. Zlicz ile meczy jest powyżej progu")
            println("8. Zakończ")

            when(readln().toIntOrNull()) {
                1 -> dodajWynik()
                2 -> wynikPowyzejProgu()
                3 -> bonusowePunkty()
                4 -> sumaWynikow()
                5 -> maksWynik()
                6 -> roznicaMaksMin()
                7 -> liczbaMeczyPowyzejProgu()
                8 -> {
                    println("Zakończono program.")
                    return
                }
                else -> println("Błąd!")
            }
        }
    }
}
fun main(){
    val analyzer = sportsResultAnalyzer()
    analyzer.menu()
}