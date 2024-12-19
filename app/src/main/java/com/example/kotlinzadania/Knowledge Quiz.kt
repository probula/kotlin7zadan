interface Pytanie {
    fun zapytaj(): String
    fun sprawdzOdpowiedz(odpowiedz: String): Boolean
}

class PrawdaFalsz(val pytanie: String, val poprawnaOdpowiedz: Boolean) : Pytanie {
    override fun zapytaj() = "$pytanie (prawda/fałsz)"
    override fun sprawdzOdpowiedz(odpowiedz: String) =
        (odpowiedz == "prawda" && poprawnaOdpowiedz) || (odpowiedz == "fałsz" && !poprawnaOdpowiedz)
}

class WielokrotnyWybor(val pytanie: String, val opcje: List<String>, val indeksOdpowiedzi: Int) : Pytanie {
    override fun zapytaj() = "$pytanie\n" + opcje.joinToString("\n")
    override fun sprawdzOdpowiedz(odpowiedz: String) =
        odpowiedz.toIntOrNull() == indeksOdpowiedzi
}

fun main() {
    val pytania = listOf(
        PrawdaFalsz("Czy Lewandowski jest najlepszym piłkarzem na świecie?", true),
        WielokrotnyWybor("Ile goli strzelił Lewandowski w ciągu 9 min podczas meczu Bayernu Monachium przeciwko Wolfsburgowi w 2015 roku?",
            listOf("1. 5", "2. 1", "3. 4", "4. 3"), 1),
    )
    for (p in pytania) {
        println(p.zapytaj())
        val odpowiedz = readLine() ?: ""
        println(if (p.sprawdzOdpowiedz(odpowiedz)) "Poprawna odpowiedź!" else "Błędna odpowiedź.")
    }
}
