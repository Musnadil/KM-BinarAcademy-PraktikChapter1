package latihan3Footwear

class ViewFootwear {
    fun view() {
        val list = Footwear.data
        val menu = ShowMenu()

        if (list.size <= 0) {
            println("There are no footwears to display!")
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
            menu.menu()
        }
    }
}