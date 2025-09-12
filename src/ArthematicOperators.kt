
/**
 * Function is a block of code that perform a specific task . It can take input parameters and can return a value.
 */

private fun main(){
    println("Multiply == ${multiply(a=4, b= 6)}")

//   println("Divide")
//    var a = 20.0F
//    var b = 10
//    var c = a / b
//    println(c)
//    println(c::class.simpleName)
   logicalStudying()


}

fun normal(){
    println("Vishal") //
}

fun add(a: Int, b: Int): Int{
    return a+b
}

fun multiply(a: Int, b: Int): Int{
    return  a *b
}

/**
 * == Compare values
 *  != check two values are not equal
 *  && == Return true when all conditions are true
 *  || -- Return True if any one conditions
 */

fun logicalStudying(){
    var a = 9
    var b = 10
    // println(a != b)

    println(a == 100 || b == 10)
}
