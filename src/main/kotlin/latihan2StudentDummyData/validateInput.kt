package latihan2StudentDummyData

class validateInput {
    fun isNumber(n:String?):Boolean {
        return if (n.isNullOrEmpty()) {
            false
        } else {
            n.all { Character.isDigit(it)}
        }
    }
}