fun main(a:Array<String>){
    var age = 18
    var option = 3
    //special for Kotlin is the if-else condition result can be stored into the variable
    var str = if(age>=18){
        "You are allowed to drink!!!"
    }
    else{
        "You aren't allowed to drink!!!"
    }
    println(str)

    //when == switch case
    when(option){
        1 -> {
            println("Beer")
        }
        2 -> {
            println("Whiskey")
        }
        3 -> {
            println("Vokar")
        }
        else -> {
            println("Juice")
        }
    }
}