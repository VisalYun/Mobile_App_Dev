//List is immutable and its methods supports only read functionalities.
fun main(args: Array<String>){
    var stringList = listOf("Ajay","Vijay","Prakash",1,"Rohan")
    var list: List<String> = listOf<String>("Ajay","Vijay","Prakash")
    for(element in stringList){
        print("$element ")
    }
    println()
    println(stringList.get(0))
    println(stringList.indexOf("Vijay"))
    println(stringList.lastIndexOf("Vijay"))
    println(stringList.size)
    println(stringList.contains("Prakash"))
    println(stringList.containsAll(list))
    println(stringList.subList(2,4))
    println(stringList.isEmpty())
    println(stringList.drop(1))
    println(stringList.dropLast(2))

    //Mutable list
    var mutableList1 = mutableListOf("Ajay","Vijay")
    mutableList1.add("Prakash")
    mutableList1.add("Vijay")

    var mutableList2 = mutableListOf<String>()
    mutableList2.add("Ajeet")
    mutableList2.add("Amit")
    mutableList2.add("Akash")

    for(element in mutableList1){
        println(element)
    }
    println()
    for(element in mutableList2){
        println(element)
    }
}