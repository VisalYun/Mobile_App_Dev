class Company {
    var name: String = ""
        get() = field // getter use to get the value
        set(value) { // setter use to set the value to any variable
            field = value
        }
}
fun main(args: Array<String>) {
    val c = Company()
    c.name = "GeeksforGeeks"  // access setter 
    println(c.name)           // access getter  
} 
