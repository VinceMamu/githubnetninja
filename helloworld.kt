import java.util.Calendar
import java.util.Random

fun main(){  
    println("test")

    var dayToday: Int = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    println ( when(dayToday){
    1 -> "Sun"
    2 -> "Mon"
    3 -> "Tues"
    4 -> "Wed"
    5 -> "Thurs"
    6 -> "Fri"
    7 -> "Sat"
    else-> "error"})
    chooseADay()

}

fun timeCheck(){
    println("Enter your time")
    var a = readLine()!!
    println("You have inputted $a")
    var b: Int? = a.toIntOrNull()
    println( when (b){
    in 1..12 -> "Morning, Kotlin"
    in 13..24 -> "Evening, Kotlin"
    else -> "Error"
    })
}

fun chooseADay(){
    val day = returnDay()
    println("Today is $day")
}
fun returnDay(): String {
    val week = listOf("Mon", "Tues", "Wed", "Thurs", "Fri", "Sat", "Sun")
    return week[Random().nextInt(7)]
}
