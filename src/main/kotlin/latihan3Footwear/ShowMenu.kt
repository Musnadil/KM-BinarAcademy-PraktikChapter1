package latihan3Footwear

import kotlin.system.exitProcess

class ShowMenu {
    fun menu(){
        println("""
        Just Du It !!
        =============
        1. Add Footwear
        2. view Footwear
        3. Update Footwear
        4. Delete Footwear
        5. Exit
    """.trimIndent())
        print(">> ")

        when(readLine()){
            "1" -> {
                val insert = InsertFootwear()
                insert.nameFootwear()
            }
            "2" -> {
                val read = ViewFootwear()
                read.view()
            }
            "3" -> {
                val update = Update()
                update.showFirst()
            }
            "4" -> {
                val delete = Delete()
                delete.showFirst()
            }
            "5" -> {
                println("Thanks for using Du It Program !")
                exitProcess(0)
            }
            else ->{
                menu()
            }
        }
    }
}