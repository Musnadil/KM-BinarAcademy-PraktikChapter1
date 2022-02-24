package latihan2StudentDummyData

import kotlin.system.exitProcess

class Menu {
    fun loggedIn() {
        println("""
        
        ==================
        Welcome, ${Storage.name}
        Student Dummy Data
        ==================
        1. View Data
        2. Update Data
        3. Exit
        """.trimIndent())
        print(">> ")
        val choice = readLine()?.toInt()
        val read = Read()
        val update = Update()
        when(choice){
            1 -> read.viewData()
            2 -> update.showData()
            3 -> exitProcess(0)
        }
    }
}