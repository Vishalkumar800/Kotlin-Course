import java.util.Locale

/**
 * Kotlin is programming language ,and it is statically type language.
 * val ----  val cannot be reassigned
 * var --- var , its value can be reassigned.
 * static type language this type language compile the code at compileTime and Dynamically type language compile the code at the runTime.
 */

//Float size is 4bytes = 32bits
//Double size is 8bytes = 64 bits

fun main(){
    var age = 8.00728277612
    println(age)
    println(age::class.simpleName)

    var isRight = false
    println(isRight)
}
