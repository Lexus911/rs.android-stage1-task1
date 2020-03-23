package subtask4

class StringParser {
    
fun getResult(inputString: String): Array<String> {
        val builder = StringBuilder(inputString)
        val openbrackets = listOf('(', '<', '[')
        val closebrackets = listOf(')', '>', ']')
        val res = ArrayList<String>()
        var last = 0

        for (i in builder.length - 1 downTo 0) {
            if (openbrackets.contains(builder[i])) {
                for (j in i until builder.length) {
                    if (builder[j] == closebrackets[openbrackets.indexOf(inputString[i])]){
                        last = j
                    builder[last] = '_'
                    break
                }
            }
            res.add(0, inputString.substring(i + 1, last))
        }
    }
    return res.toTypedArray()
}
}
