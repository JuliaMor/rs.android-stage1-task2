package subtask5

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import kotlin.reflect.KClass

class Blocks {
    fun getData(blockA: Array<Any>, blockB: KClass<*>): Any {
        when (blockB) {
            Int::class -> {
                var result = 0
                for (isInt in blockA) {
                    if (isInt is Int) result += isInt
                }
                return result
            }
            String::class -> {
                val result = StringBuilder()
                for (isString in blockA) {
                    if (isString is String) result.append(isString)
                }
                return result.toString()
            }
            LocalDate::class -> {
                var result = LocalDate.MIN
                for (isLD in blockA) {
                    if (isLD is LocalDate && isLD > result) result = isLD
                }
                return result.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"))
            }
            else -> throw UnsupportedOperationException("Not implemented")
        }

    }
}
