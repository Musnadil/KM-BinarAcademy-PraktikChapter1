package latihan3Footwear

class Update {
    val list = Footwear.data
    val menu = ShowMenu()

    fun showFirst(){
        if (list.size <= 0) {
            println("There are no footwears to update!")
            menu.menu()
        } else{
            println()
            println("=============================================================")
            println("| No\t| Name\t\t| Price\t\t| Height\t| Total Wheel\t|")
            println("=============================================================")
            for (footwear in list) {
                val number = list.indexOf(footwear) + 1
                println("| $number\t\t| ${footwear.name}\t| ${footwear.price}\t| ${footwear.height}\t\t\t| ${footwear.wheels}\t\t\t|")
            }
        }
        updateData()
    }
    fun updateData(){
        print("Input footwear index to update : ")
        val updateInput = readLine()
        if (updateInput != null){
            if(validate.isNumber(updateInput)){
                val update = updateInput.toInt()
                if (update<=0 || update > list.size ){
                    updateData()
                }else{
                    updateNameFootwear(update)
                }
            }else{
                updateData()
            }
        }else{
            updateData()
        }
    }

    fun updateNameFootwear(update:Int) {
        print("Footwear name [3 - 25 characters]: ")
        val nameInput = readLine()
        if (nameInput != null) {
            if (validate.isNumber(nameInput)) {
                updateNameFootwear(update)
            } else {
                if (nameInput.length < 3 || nameInput.length > 25) {
                    updateNameFootwear(update)
                } else {
                    updatePriceFootwear(nameInput.toString(),update)
                }
            }
        } else {
            updateNameFootwear(update)
        }
    }
    private fun updatePriceFootwear(name:String,update:Int) {
        print("Footwear price [more than 10000]: ")
        val priceInput = readLine()
        if (priceInput != null){
            if(validate.isNumber(priceInput)){
                val price = priceInput.toInt()
                if (price < 10000){
                    updatePriceFootwear(name,update)
                }else{
                    updateTypeFootwear(name,price,update)
                }
            }else{
                updatePriceFootwear(name,update)
            }
        }else{
            updatePriceFootwear(name,update)
        }
    }
    private fun updateTypeFootwear(name:String, price:Int,update:Int) {
        print("Footwear Type [Heels / RollerSkate]: ")
        val typeInput = readLine()
        if (typeInput != null){
            if (validate.isNumber(typeInput)){
                updateTypeFootwear(name,price,update)
            }else{
                when (typeInput.toString()) {
                    "Heels" -> {
                        updateHeelHeight(name,price,typeInput.toString(),update)
                    }
                    "RollerSkate" -> {
                        updateTotalWheels(name,price,typeInput.toString(),update)
                    }
                    else -> {
                        updateTypeFootwear(name, price,update)
                    }
                }
            }
        }else{
            updateTypeFootwear(name, price,update)
        }
    }
    private fun updateTotalWheels(name:String, price:Int, type:String,update:Int) {
        print("Footwear total wheel [2 - 4 inclusive]: ")
        val wheelInput = readLine()
        if (wheelInput != null){
            if (validate.isNumber(wheelInput)){
                if(wheelInput.toInt() <2 || wheelInput.toInt()>4 ){
                    updateTotalWheels(name,price,type,update)
                }else{
                    list.set(update-1, Data(name,price,type,"-",wheelInput.toString()))
                    println("Footwear updated successfully !!")
                    menu.menu()
                }
            }else{
                updateTotalWheels(name, price, type, update)
            }
        }else{
            updateTotalWheels(name, price, type, update)
        }
    }
    private fun updateHeelHeight(name:String, price:Int, type:String, update:Int) {
        print("Footwear height [1.0 - 9.0]: ")
        val heightInput = readLine()
        if (heightInput != null){
            val height = heightInput.toDouble()
            if (height<1.0 || height>9.0){
                updateHeelHeight(name,price,type,update)
            }else{
                list.set(update-1, Data(name,price,type,height.toString(),"-"))
                println("Footwear updated successfully !!")
                menu.menu()
            }
        }else{
            updateHeelHeight(name, price, type, update)
        }
    }
}