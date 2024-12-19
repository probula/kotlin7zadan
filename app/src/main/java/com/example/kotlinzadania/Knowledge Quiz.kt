interface Pytanie {
    fun zapytaj(): String
    fun sprawdzOdpowiedz(odpowiedz: String): Boolean
}

class PrawdaFalsz(val pytanie: String, val poprawnaOdpowiedz: Boolean) : Pytanie {
    override fun zapytaj() = "$pytanie (prawda/fałsz)"
    override fun sprawdzOdpowiedz(odpowiedz: String) =
        (odpowiedz == "prawda" && poprawnaOdpowiedz) || (odpowiedz == "fałsz" && !poprawnaOdpowiedz)
}

fun main() {
    val pytanie = PrawdaFalsz("Czy Lewandowski jest najlepszym piłkarzem na świecie?", true)
    println(pytanie.zapytaj())
    val odpowiedz = readLine() ?: ""
    println(if (pytanie.sprawdzOdpowiedz(odpowiedz)) "Poprawna odpowiedź!" else "Błędna odpowiedź.")
}
