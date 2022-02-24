package latihan2StudentDummyData

class Create {
    fun name() {
        print("Input your name [3-15 characters](cannot be change): ")
        val namaInput = readLine()
        if (validate.isNumber(namaInput)){
            println("Name cannot contain numeric characters")
            name()
        }else{
            val namaValid = namaInput.toString()
            val panjangNama = namaValid.length
            if (panjangNama<3) {
                println("Name is too short")
                name()
            }else if(panjangNama>15){
                println("Name is too long")
                name()
            }else{
                Storage.name = namaValid
                age()
            }
        }
    }
    fun age() {
        print("Input your age [min 16](cannot be change): ")
        val umurInput = readLine()
        if(validate.isNumber(umurInput)){
            val umur = umurInput.toString().toInt()
            if (umur < 16){
                println("Minimum age 16 years")
                age()
            }else{
                Storage.age = umur
                gpa()
            }
        }else{
            println("Age must use numbers!")
            age()
        }
    }

    fun gpa() {
        print("Input your gpa [0.0 - 4.0 inclusive]: ")
        val gpaInput = readLine()?.toDouble()
        val menu = Menu()

        if (gpaInput != null) {
            if (gpaInput<0.0 || gpaInput> 4.0){
                println("GPA diluar batas")
                gpa()
            }else{
                Storage.gpa = gpaInput
                menu.loggedIn()
            }
        }else{
            println("GPA cannot be empty")
            gpa()
        }
    }
}