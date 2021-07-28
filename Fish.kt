import kotlin.math.*

fun main(){
    println(canAddFish(currentFish = 4.0))
}

fun canAddFish(tanksize: Double = 9.0, currentFish: Double = 0.0, fishSize: Double = 2.0, hasDecorations: Boolean = true): Boolean{
    var value: Int = ((if (hasDecorations==true) tanksize*0.8 else tanksize)).toInt()
    var calculate: Int = ((currentFish * fishSize)).toInt()
    return when(calculate){
        in 0..value -> true
        else -> false
    }
}