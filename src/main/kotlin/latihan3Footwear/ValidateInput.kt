package latihan3Footwear

class ValidateInput {
    fun isNumber(n:String?):Boolean {
        return if (n.isNullOrEmpty()) {
            false
        } else {
            n.all { Character.isDigit(it)}
        }
    }
}