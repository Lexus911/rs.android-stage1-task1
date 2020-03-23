package subtask3

class BillCounter {
    
fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        val AnnPayment = (bill.sum() - bill[k]) / 2
        val c = (b - AnnPayment)
        if(AnnPayment == b)
            return "Bon Appetit"
        else
            return c.toString()
    }   
}
