/**
 * The first 3 functions, all called printNumber, demonstrate function
 * overloading. This is polymorphism that is determined at compile time.
 * Basically, the compiler knows which function to use based on the type of the
 * input parameter n.
 */
fun printNumber(n : Number){
    println("Using printNumber(n : Number)")
    println(n.toString() + "\n")
}

fun printNumber(n : Int){
    println("Using printNumber(n : Int)")
    println(n.toString() + "\n")
}

fun printNumber(n : Double){
    println("Using printNumber(n : Double)")
    println(n.toString() + "\n")
}

/**
 * This function shows runtime polymorphism. In this case, all objects are of type Number.
 * Number has a toDouble() method which is different for each kind of number. However, since
 * all classes that extend Number must implement toDouble(), we can trust that longs, ints, floats,
 * etc can all make the conversion to a double when needed.
 */
fun sum(numbers : List<Number>) : Number {
    return numbers.sumByDouble { it.toDouble() } //it == numbers
}

fun main(args : Array<String>){
    val a : Number = 99
    val b = 1
    val c = 3.1

    //Using compile time polymorphism
    printNumber(a)
    printNumber(b)
    printNumber(c)

    //Using runtime polymorphism
    println("Summing all numbers")
    println(sum(listOf(a, b, c)))
}