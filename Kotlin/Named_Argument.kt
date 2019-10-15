//used when we want to change others argument's value beside the first argument value because you want to use the default first argument
fun displayBorder(character: Char = '=', length: Int = 15) {
    for (i in 1..length) {
        print(character)
    }
}
fun main(args: Array<String>) {
    displayBorder(length = 5)
}
