package subtask3

class Abbreviation {

    fun abbreviationFromA(a: String, b: String): String {
        val rg = Regex("[^${b}]")
        val res = a.toUpperCase().replace(rg, "")
        return if (res == b) "YES" else "NO"
    }
}
