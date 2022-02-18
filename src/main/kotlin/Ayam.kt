class Ayam(val name:String, val age:Int):MakhlukHidup(){

    lateinit var alamat:String
    constructor(name:String, age:Int, warnaBulu:String) : this(name,age){
    println("Nama $name | age $age | warna bulu $warnaBulu ")
//        super.sebutWarna()
        alamat = "bandung"
    }

    fun berkokok(){
        println("si $name berkokok" )
    }
}

