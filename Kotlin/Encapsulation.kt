class Worker{
    constructor(firstName: String,middleName:String,lastName:String){
        this.firstName = firstName
        this.middleName = middleName
        this.lastName = lastName
    }
    //Encapsulation is the concept where data is wrap in to single unit. Its purpose is for code security, that why Private modifier is the best
    private var firstName =""  // has value
    private var middleName = ""  // has value
    private var lastName = ""  // has value
    fun getFullName(): String { // does work
        return firstName + " "+ middleName + " "+ lastName
    }
    fun getReverseName():String{ //does work
        return this.lastName + " "+ this.middleName + " "+ this.firstName
     }
    //setter method get data from parameter then change data . getter method only return data .
    fun setFirstName(name:String){
        this.firstName = name
    }
    fun getLastName():String{
        return this.lastName
    }
}

fun main(a:Array<String>){
    var john = Worker("Md","John","Ahamed")
    //john.firstName = "sfdsf"; // compiler error
    john.setFirstName("Dm")
    println(john.getFullName())
    println(john.getReverseName())

}