class Krokomkierz{

    companion object{
        var liczba = 0 //val - stała
    }

    fun krok(){
        println("Aby zliczac kroki wpisz SPACJE i kliknij ENTER, aby zakonczyc liczenie wpisz 'koniec'")
        while (true){
            val input = readln()

            if(input == " "){
                liczba+=1
                println("liczba kroków: " + liczba)
            }
            else if(input.lowercase() == "koniec"){
                println("Zakończono zliczanie, łączna liczba kroków:  " + liczba)
                resetuj()
            }
        }
    }

    fun resetuj(){
        println("Czy chcesz zresetować swój licznik?: Wpisz 'tak' lub 'nie': ")
        val wybor = readln().lowercase()

        if(wybor == "nie"){
            krok()
        }
        else if(wybor == "tak"){
            liczba = 0
            println("Zresetowano\nAktualna liczba kroków: " + liczba)
        }
        else{
            println("nieznana komenda")
        }
    }
}

fun main(){
    val krokomierz = Krokomkierz()
    krokomierz.krok()
    krokomierz.resetuj()
}