fun main(a:Array<String>){
    //declare string
    var str = "Hello World"
    println(str)

    //access the character of string
    println(str[0])

    //length of string
    println(str.length)

    //get acsii value of character
    for(i in str){
        println(i.toInt())
    }

    //convert acsii value to character
    var num = 97
    println(num.toChar())
}