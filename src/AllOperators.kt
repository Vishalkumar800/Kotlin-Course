private fun main(){

   // val userInput = readln()

//    println("Enter Your pet name")
//    val userInput = readln()
//    println("My pet name is $userInput")

//    println("user Input $userInput")
//    println("Reversed ${userInput.reversed()}")

    /**
     * Assignment Operators
     *  = , += , -=
     */

    /**
     * Relational Operators
     *  > ,< , == , !=
     *  ==      Compare two values if they are equal returns true
     *  !=      Compare two values if they are not equal then it returns true
     */

//    var a = 100
//    a -= 10
//    println(a)

//    var a = readln()
//    var b = readln()
//    if (a != b){
//        println("Yes")
//    }else{
//        println("No")
//    }

    logicalOperators()

}

fun logicalOperators(){
    /**
     *  && and ||
     *  && returns true when all the statements are true
     *  || returns true if any statement is true
     */

    var a = readln().toInt()
    var b = readln().toInt()

    if (a == 2 || b == 5){
        println("True")
    }else{
        println("False")
    }
}
