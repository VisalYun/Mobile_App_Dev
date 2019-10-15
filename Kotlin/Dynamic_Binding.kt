open class Animal{
    open fun eat(){
        println("animal is eating...")
    }
}

class Dog: Animal(){
    override fun eat(){
        println("Dog is eating...")
    }
}

//Dynamic binding is how type of object is determined at runtime
fun main(a:Array<String>){
    var d = Dog()
    d.eat()
}