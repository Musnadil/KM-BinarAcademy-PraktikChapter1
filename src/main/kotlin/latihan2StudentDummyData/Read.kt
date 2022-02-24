package latihan2StudentDummyData

class Read {
    fun viewData(){
        println("""
        
        *************************************
        Your name is ${Storage.name}      
        Your age is ${Storage.age}        
        Your GPA is ${Storage.gpa} / 4.0  
        *************************************
    """.trimIndent())
        val menu = Menu()
        menu.loggedIn()
    }
}