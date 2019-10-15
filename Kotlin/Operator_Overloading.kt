class number(val num:Int){
    constructor() : this(0) {
        print("Result: ")
    }
    operator fun plus(n: number) : number {
        return number(num-n.num)
    }
}

fun main(a:Array<String>){
    val n1 = number(1)
    val n2 = number(2)
    var ans = number()
    ans = n1 + n2
    println(ans.num)
}