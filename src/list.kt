private fun main(){

    /**
     * list is immutable and for read only
     * In mutable List we can add element
     */

    val numbersList = mutableListOf(1,3,4,5)
    println(numbersList)
    println(numbersList.indexOf(3))

    numbersList.add(100)
    println(numbersList)


}