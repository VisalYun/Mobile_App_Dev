//Constructor is the block of code that finalize object creation. 2 types of constructor: primary and secondary
fun main(args: Array<String>) {
    println("Primary constructor")
    val person1 = Person("joe", 25)

    println("Secondary Constructor")
    val p1 = AuthLog("Bad Password")
}

class Person(fName: String, personAge: Int) { //Primary constructor: use to initialize class
    var firstName: String
    var age: Int
    // initializer block
    init {
        firstName = fName.capitalize()
        age = personAge
        println("First Name = $firstName")
        println("Age = $age")
    }
}

//Secondary constructor is used to when you need to extend a class that provides multiple constructors that initialize
// the class in different ways.
open class Log {
    var data: String = ""
    var numberOfData = 0
    constructor(_data: String) {}
    constructor(_data: String, _numberOfData: Int) {
        data = _data
        numberOfData = _numberOfData
        println("$data: $numberOfData times")
    }
}
class AuthLog: Log {
    constructor(_data: String): this("From AuthLog -> " + _data, 10) {}
    constructor(_data: String, _numberOfData: Int): super(_data, _numberOfData) {}
}