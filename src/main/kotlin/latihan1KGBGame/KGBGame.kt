package latihan1KGBGame

class KGBGame {
    fun welcomeUser(user:String){
        // welcome user
        println("=================================\n" +
                "\tGAME SUIT TERMINAL VERSION\n" +
                "=================================\n" +
                "Welcome $user!\n" +
                "=================================\n" +
                "#  Select One :                 #\n" +
                "#  1. Rock                      #\n" +
                "#  2. Scissor                   #\n" +
                "#  3. Paper                     #\n" +
                "=================================")

        rules(user)
    }

    fun rules(user:String){
        // masukan dari user
        print("Enter your choice : ")
        var userChoice = readLine().toString().toInt()

        val pilihanUser = when(userChoice){
            1 -> "rock"
            2 -> "scissor"
            3 -> "paper"
            else -> {
                println("you only have 3 choices")
                welcomeUser(user)
            }

        }
        // pilihan random dari cpu
        val computer = arrayOf("rock","scissor","paper")
        var cpu = computer.random()

        // manampilkan pilihan user dan cpu
        if(userChoice > 3){
            pilihanUser

        }else{
            println("$user Choice : ${pilihanUser}")
            println("CPU Choice : ${cpu}")
        }

        // peraturan game batu gunting kertas
        var hasil = false
        if (pilihanUser.equals(cpu)){
            println("Result : DRAW!")

        }else if(pilihanUser.equals("rock")){
            if (cpu.equals("scissor")){
                hasil = true
                result(hasil,user)
            }else{
                hasil = false
                result(hasil,user)
            }
        } else if(pilihanUser.equals("scissor")){
            if(cpu.equals("paper")){
                hasil = true
                result(hasil,user)
            }else{
                hasil = false
                result(hasil,user)
            }
        } else if (pilihanUser.equals("paper")){
            if(cpu.equals("rock")){
                hasil = true
                result(hasil,user)
            }else{
                hasil = false
                result(hasil,user)
            }
        }
        return welcomeUser(user)

    }

    fun result(hasil:Boolean,user:String){
        if(hasil){
            println("Result : $user Win!")
        }else{
            println("Result : CPU Win!")
        }
    }
}