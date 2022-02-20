package latihahanChallange1

class Menu {

    fun mainMenu(user: ArrayList<String>,pass: ArrayList<String>){
        println("Welcome to KGB Game!\n" +
                "=============================\n" +
                "GAME SUIT TERMINAL VERSION\n" +
                "=============================\n" +
                "1. Registration\n" +
                "2. Login")
        var userChoice = readLine().toString().toInt()
        if(userChoice == 1){
            regis(user,pass)
        } else if (userChoice ==2){
            login(user,pass)
        }else{
            println("you only have 2 choices")
            mainMenu(user,pass)
        }
    }

    fun regis(user:ArrayList<String>,pass:ArrayList<String>){
        println("Welcome to KGB Game!\n" +
                "=============================\n" +
                "GAME SUIT TERMINAL VERSION\n" +
                "=============================\n" +
                "Registration")
        print("Input Username : ")
        var username = readLine().toString()
        print("Input Password : ")
        var password = readLine().toString()
        print("Re-input Password : ")
        var rePass = readLine().toString()

        if(password.toLowerCase().equals(rePass.toLowerCase())){
            user.add(username)
            pass.add(password)
            println("Registration Successfully")
            mainMenu(user,pass)
        }else{
            println("Registration failed, please try again")
            mainMenu(user,pass)
        }


    }
    fun login(user:ArrayList<String>,pass:ArrayList<String>) {
        println("Welcome to KGB Game!\n" +
                "=============================\n" +
                "GAME SUIT TERMINAL VERSION\n" +
                "=============================\n" +
                "Login")
        print("Input Username : ")
        var username = readLine().toString()
        print("Input Password : ")
        var password = readLine().toString()


        var indexUser = user.indexOf(username)
        var indexPass = pass.indexOf(password)
        if (indexUser <0){
            println("Username not registered")
            mainMenu(user,pass)
        }else{
            if (indexUser == indexPass){
                val kgb = KGBGame()
                kgb.welcomeUser(username)
            }else{
                println("Password is wrong!")
                mainMenu(user,pass)

            }
        }
    }

}