package latihan1KGBGame

class Menu {


    fun mainMenu(listAccount: ArrayList<Account>){

        println("Welcome to KGB Game!\n" +
                "=============================\n" +
                "GAME SUIT TERMINAL VERSION\n" +
                "=============================\n" +
                "1. Registration\n" +
                "2. Login")
        print("Select one : ")

        var userChoice = readLine()?.toInt()

        when(userChoice){
            1 -> {
                regis(listAccount)
            }
            2 -> {
                login(listAccount)
            }
            else ->{
                println("you only have 2 choices")
                mainMenu(listAccount)
            }
        }
//        if(userChoice == 1){
//            regis(account)
//        } else if (userChoice ==2){
//            login(account)
//        }else{
//            println("you only have 2 choices")
//            mainMenu(account)
//        }
    }

    fun regis(listAccount:ArrayList<Account>){
        println("Welcome to KGB Game!\n" +
                "=============================\n" +
                "GAME SUIT TERMINAL VERSION\n" +
                "=============================\n" +
                "Registration")
        print("Input Username : ")
        var usernameInput = readLine().toString()
        print("Input Password : ")
        var passwordInput = readLine().toString()
        print("Re-input Password : ")
        var rePassInput = readLine().toString()

        if(passwordInput.lowercase().equals(rePassInput.lowercase())){

            listAccount.add(Account(usernameInput,passwordInput))
            println("Registration Successfully")
            mainMenu(listAccount)

        }else{
            println("Registration failed, please try again")
            mainMenu(listAccount)
        }


    }
    fun login(listAccount:ArrayList<Account>) {
        println("Welcome to KGB Game!\n" +
                "=============================\n" +
                "GAME SUIT TERMINAL VERSION\n" +
                "=============================\n" +
                "Login")
        print("Input Username : ")
        var usernameInput = readLine().toString()
        print("Input Password : ")
        var passwordInput = readLine().toString()

        var isLoginSuccess = false
        var signedAccount = Account("","")

        for(player in listAccount){
            if (player.username == usernameInput
                && player.password == passwordInput){
                isLoginSuccess = true
                signedAccount = player
            }
        }
        if (isLoginSuccess){
            val kgb = KGBGame()
          kgb.welcomeUser(signedAccount.username)

        }else{
            println("Wrong Username or Password")
            login(listAccount)
        }


//        var indexUser = user.indexOf(username)
//        var indexPass = pass.indexOf(password)
//        if (indexUser <0){
//            println("Username not registered")
//            mainMenu(user,pass)
//        }else{
//            if (indexUser == indexPass){
//                val kgb = KGBGame()
//                kgb.welcomeUser(username)
//            }else{
//                println("Password is wrong!")
//                login(user,pass)
//
//            }
//        }
    }

}