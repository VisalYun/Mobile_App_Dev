fun main(a:Array<String>){
    //jump constructor, generally use to specify loop name
    var flag = 0
    outter_loop@for(i in 1..5){
        inner_loop@for(j in 1..5){
            if(i%j == 0){
                flag++
            }
            else{
                continue@inner_loop
            }
        }
        if(flag<=2){
            println(i)
        }
        else{
            break@outter_loop
        }
    }
}