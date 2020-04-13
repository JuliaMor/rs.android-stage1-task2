package subtask1

import java.text.SimpleDateFormat
import java.util.*

class DateFormatter {
    fun toTextDay(day: String, month: String, year: String): String {
        val calendar = Calendar.getInstance(Locale("RU")).apply {
            set(Calendar.YEAR, year.toInt())
            set(Calendar.MONTH, month.toInt().minus(1))
            set(Calendar.DAY_OF_MONTH, day.toInt())
        }
        val isValidDate =
            calendar.get(Calendar.DAY_OF_MONTH) == day.toInt() && calendar.get(Calendar.MONTH).plus(
                1
            ) == month.toInt()

        return if (isValidDate) {
            SimpleDateFormat("d MMMM, EEEE", Locale("RU")).format(Date(calendar.timeInMillis))
        } else {
            "Такого дня не существует"
        }
    }
}
