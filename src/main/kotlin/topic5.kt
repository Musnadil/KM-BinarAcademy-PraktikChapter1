fun main() {
//    makan()
//    myFunction("ken", 10)
//    myFunction("je", 20)
//    myFunctionTwo()
//    myFunctionThree(4,2)


//    val judul = "android developer Binar is the best!!"
//    println(judul.toTitleCase())

//    val result1 = sum1(2,3)
//    val result2 = sum2(3,4)
//    println(result1)
//    println(result2)
//    println(sum1(5,7))

    val challange = ChallengeTopic5()
    challange.ganjilOrGenap()
    challange.fibbonaci()
}

fun makan(){
    println("Makan nasi goreng")
}

fun myFunction(fName: String, age:Int){
    println("${fName}dor berumur ${age} tahun")
}

fun myFunctionTwo(
    fName : String = "musnadil",
    negara : String = "Indonesia"
    ):String{
    return "$fName $negara"
}

fun myFunctionThree(x:Int,y:Int):Int{
    return (x+y)
}


fun String.toTitleCase():String{
    return this.split(" ").joinToString(" "){
        it.capitalize()
    }
}

val sum1 = {a:Int,b:Int->a+b}
val sum2 : (Int,Int)->Int = {a , b ->a+b}