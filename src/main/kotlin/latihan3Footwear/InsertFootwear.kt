package latihan3Footwear

class InsertFootwear {
    val menu = ShowMenu()
    fun nameFootwear() {
        print("Footwear name [3 - 25 characters]: ")
        val nameInput = readLine()
        if (nameInput != null) {
            if (validate.isNumber(nameInput)) {
                nameFootwear()
            } else {
                if (nameInput.length < 3 || nameInput.length > 25) {
                    nameFootwear()
                } else {
                    priceFootwear(nameInput.toString())
                }
            }
        } else {
            nameFootwear()
        }
    }


    private fun priceFootwear(name:String) {
        print("Footwear price [more than 10000]: ")
        val priceInput = readLine()
        if (priceInput != null){
            if(validate.isNumber(priceInput)){
                val price = priceInput.toInt()
                if (price < 10000){
                    priceFootwear(name)
                }else{
                    typeFootwear(name,price)
                }
            }else{
                priceFootwear(name)
            }
        }else{
            priceFootwear(name)
        }
    }

    private fun typeFootwear(name:String,price:Int) {
        print("Footwear Type [Heels / RollerSkate]: ")
        val typeInput = readLine()
        if (typeInput != null){
            if (validate.isNumber(typeInput)){
                typeFootwear(name,price)
            }else{
                when (typeInput.toString()) {
                    "Heels" -> {
                        heelHeight(name,price,typeInput.toString())
                    }
                    "RollerSkate" -> {
                        totalWheels(name,price,typeInput.toString())
                    }
                    else -> {
                        typeFootwear(name, price)
                    }
                }
            }
        }
    }

    private fun totalWheels(name:String,price:Int,type:String) {
        print("Footwear total wheel [2 - 4 inclusive]: ")
        val wheelInput = readLine()
        if (wheelInput != null){
            if (validate.isNumber(wheelInput)){
                if(wheelInput.toInt() <2 || wheelInput.toInt()>4 ){
                    totalWheels(name,price,type)
                }else{
                    Footwear.data.add(Data(name,price,type,"-",wheelInput.toString()))
                    println("Footwear added successfully !!")
                    menu.menu()
                }
            }else{
                totalWheels(name,price,type)
            }
        }else{
            totalWheels(name,price,type)
        }

    }

    private fun heelHeight(name:String,price:Int,type:String) {
        print("Footwear height [1.0 - 9.0]: ")
        val heightInput = readLine()
        if (heightInput != null){
            if (heightInput.toDouble() <1.0 || heightInput.toDouble()>9.0){
                heelHeight(name,price,type)
            }else{
                Footwear.data.add(Data(name,price,type,heightInput.toString(),"-"))
                println("Footwear added successfully !!")
                menu.menu()
            }
        }else{
            heelHeight(name,price,type)
        }
    }
}