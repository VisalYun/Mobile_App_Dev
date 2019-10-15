fun main(args: Array<String>){
    val str = getNumber("abc")
    println(str)
}
fun getNumber(str: String): Int{
    return try {
        Integer.parseInt(str)
    } catch (e: NumberFormatException) {
        0
    }
}