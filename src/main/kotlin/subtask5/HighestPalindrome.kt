package subtask5

class HighestPalindrome {
fun highestValuePalindrome(n: Int, k: Int, digitString: String): String {
        val sb = StringBuilder(digitString)
        var count = 0
        var kk = k
        for (i in 0 until n / 2)
            if (digitString[i] != digitString[n - 1 - i])
                count++

        val diff = k - count

        if (diff < 0) {
            return "-1"
        } else {
            for (i in 0 until n / 2) {
                if (digitString[i] != digitString[n - 1 - i]) {
                    if (diff > 0 && digitString[i] != '9' && digitString[n - 1 - i] != '9'){
                        sb.setCharAt(i, '9')
                        sb.setCharAt((n - 1 - i), '9')
                    kk -= 2
                    count--
                } else {
                    val max = maxOf(digitString[i], digitString[n - 1 - i])
                    sb.setCharAt(i, max)
                    sb.setCharAt((n - 1 - i), max)
                    count--
                }
            }
        }
            return sb.toString()
        }
    }
}
