class ChallengeTopic5 {
        fun ganjilOrGenap(){
            println("Ganjil Or Genap")
            print("Masukan bilangan yang anda inginkan : ")
            var bilangan = readLine().toString().toInt()
            if(bilangan%2 == 0){
                println("angka ${bilangan} adalah bilangan genap")
            }else{
                println("angka ${bilangan} adalah bilangan ganjil")
            }
        }

        fun fibbonaci(){
            println("Fibbonaci")
            print("Masukan Limit :")
            val limit = readLine().toString().toInt()
            var bil1 = 0
            var bil2 = 1
            var i = 0

            while(i <= limit ){
                print("$bil1 + ")
                i++

                val sum = bil1 + bil2
                bil1 = bil2
                bil2 = sum

                if(bil1>limit){
                    break
                }
            }
        }

}