package latihan3Footwear

class Delete {
    private val list = Footwear.data
    val menu = ShowMenu()

    fun showFirst(){
        if (list.size <= 0) {
            println("There are no footwears to delete!")
            menu.menu()
        } else{
            println()
            println("=============================================================")
            println("| No\t| Name\t\t| Price\t\t| Height\t| Total Wheel\t|")
            println("=============================================================")
            for (footwear in list) {
                val number = list.indexOf(footwear) + 1
                println("| $number\t\t| ${footwear.name}\t| ${footwear.price}\t| ${footwear.height}\t\t\t| ${footwear.wheels}\t\t\t|")
            }
            deleteData()
        }
    }
    fun deleteData(){
        print("Input footwear index to delete : ")
        val deleteInput = readLine()
        if(deleteInput != null){
            if (validate.isNumber(deleteInput)){
                if (deleteInput.toInt() <= 0 || deleteInput.toInt() > list.size){
                    deleteData()
                }else{
                    list.removeAt(deleteInput.toInt()-1)
                    println("Footwear deleted successfully !!")
                    menu.menu()
                }
            }else{
                deleteData()
            }
        }else{
            deleteData()
        }
    }
}