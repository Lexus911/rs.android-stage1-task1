package subtask1

class HappyArray {
    
    fun convertToHappy(sadArray: IntArray): IntArray {
        val list = sadArray.toMutableList()
                for (i in list.size - 2 downTo 1) {
                    if (list[i + 1] + list[i - 1] < list[i])
                        list.removeAt(i)
                }
                return list.toIntArray()
       }
}
