package subtask2

class TimeConverter {
    fun toTextFormat(hour: String, minute: String): String {
        val h= listOf("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve");
        val min= listOf("one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty", "twenty one", "twenty two", "twenty three", "twenty four", "twenty five", "twenty six", "twenty seven", "twenty eight", "twenty nine", "thirty");
        return when (minute.toInt()) {
            0 -> h[hour.toInt()]+" o' clock"
            1 -> "one minute past "+h[hour.toInt()]
            15 -> "quarter past " + h[hour.toInt()]
            30 -> "half past " + h[hour.toInt()]
            45 -> "quarter to " + h[hour.toInt() + 1]
            in 1..30 -> min[minute.toInt() - 1] + " minutes past " + h[hour.toInt()]
            in 31..60 -> min[60 - minute.toInt() - 1] + " minutes to " + h[hour.toInt() + 1]
            else -> ""
        }
    }
}
