fun main(A:Array<String>){
        //creating array
        //var arr = arrayOf<Int>()
        //append element in array
        //arr.set(0,100)
        //print(arr)
    //ArrayIndexOutOfBoundException, due to array is immutable

    var arr = arrayOf<Int>(1,2,3,4,5)
    var arr2 = arrayOf("hello", 123, "world")
    println(arr)
    println(arr2) //Hashcode will be printed
    //print the element of array
    for(i in arr){
        print("$i ")
    }
    for(i in arr2){
        println("$i ")
    }

}