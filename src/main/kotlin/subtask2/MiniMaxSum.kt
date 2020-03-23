package subtask2

class MiniMaxSum {
    
 fun getResult(input: IntArray): IntArray {
        input.sort()
        var min = 0
        for(i in 0..input.size-2 )
            min += input[i]
        input.sortDescending()
        var max = 0
        for(i in 0..input.size-2 )
            max += input[i]
        val result = intArrayOf(min, max)
        return result
    }    
}
