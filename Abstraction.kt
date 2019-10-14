//use as the parent class in order to be implemented by other class only. Can contain all types of methods
abstract class Employee{
    fun print(){
        println("I am KIT's employee")
    }
    abstract fun department()
}

//If you implement abstract class, you need to implement all the abstract method in its
class Leo:Employee(){
    override fun department() {
        println("Director of KIT")
    }
}

fun main(a:Array<String>){
    //Error, we can't create an object of abstract class
        //var e = Employee

    var l = Leo()
    l.print()
    l.department()
}