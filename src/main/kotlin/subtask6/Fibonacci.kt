package subtask6

class Fibonacci {
    fun productFibonacciSequenceFor(n: Int): IntArray {
        val arr = intArrayOf(0, 1, 1)
        while (arr[0] * arr[1] < n) {
            val sum = arr[0] + arr[1]
            arr[0] = arr[1]
            arr[1] = sum
        }
        if(arr[0]*arr[1]!=n) arr[2] = 0
        return arr

    }
}
