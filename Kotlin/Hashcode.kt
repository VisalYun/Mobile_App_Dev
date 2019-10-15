//hashcode is 32 bit signed integer that generated from an object.

fun main(a:Array<String>){
    val user1 = User("john", 12345)
    val user2 = User("john", 123451)
    val user3 = User("john", 12345)

    println(user1) //get hashcode if we don't override toString method

    println("==")
    println(user1==user2)
    println(user1==user3)

    println(" equals method")
    println(user1.equals(user2))
    println(user1.equals(user3))

    println("toString method")
    println(user1.toString())

    println("hashCode method")
    println(user1.hashCode())
    println(user2.hashCode())
}

class User(val name:String, val code:Int){
    override fun equals(other: Any?): Boolean {
        if(other == null || other !is User)
            return false
        return name == other.name && code==other.code
    }

    override fun hashCode(): Int =
        name.hashCode() * 31+code

    override fun toString(): String {
        return "Client(name=$name, code=$code)"
    }
}