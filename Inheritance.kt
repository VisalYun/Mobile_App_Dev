open class Student(id:Int, name:String){
    open fun print(){
        println("I am a Student")
    }
}

class Mony(id: Int, name:String): Student(id,name){
    fun whoAmI(){
        println("I am Mony!!!")
    }
}
fun main(a:Array<String>){
    var m = Mony(12,"Mony")
    m.whoAmI()
    m.print()
}