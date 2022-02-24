package latihan2StudentDummyData

class Update {
    fun showData() {
        println("""
        
        *************************************
        Your name is ${Storage.name}      
        Your age is ${Storage.age}        
        Your GPA is ${Storage.gpa} / 4.0  
        *************************************
    """.trimIndent())

        updateGpa()

    }
    fun updateGpa() {
        print("Input your gpa [0.0 - 4.0 inclusive]: ")
        val gpaInput = readLine()?.toDouble()
        val menu = Menu()

        if (gpaInput != null) {
            if (gpaInput<0.0 || gpaInput> 4.0){
                println("GPA diluar batas")
                updateGpa()
            }else{
                Storage.gpa = gpaInput
                println("Student data updated successfully")
                menu.loggedIn()
            }
        }else{
            println("GPA cannot be empty")
            updateGpa()
        }
    }
}
