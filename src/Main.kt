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
    var age = 8.0098
    println(age)
    println(age::class.simpleName)

    val name = "My name is Vishal"
    println(name.uppercase())
    println(name.lowercase())

    println("Functions")
    name()
    println(add(4,9))
    addPrint(9,8)
}

/**
 * Function is a block of code that perform a specific task . It can take input parameters and can return a value.
 */

fun name(){
    println("Vishal")
}

fun add(a: Int, b: Int): Int{
    return a+b
}

fun addPrint(a: Int , b : Int){
    println(a+b)
}

