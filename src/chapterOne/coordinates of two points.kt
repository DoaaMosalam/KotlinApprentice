package chapterOne

import java.lang.Math.sqrt

fun main() {
//     val x1: Double = 2.0
//     val y1: Double = 3.0
//     val x2: Double = 4.0
//     val y2: Double = 5.0
//
//    val distance= sqrt(x2-x1) *(x2-x1) + sqrt(y2-y1)*(y2-y1)
//    println("Distance between these two points = $distance")

    val c = coordinates()
    println(c.solutaion(2.0,3.0,4.0,5.0).toString())
}
class coordinates{
    fun solutaion(x1:Double,x2:Double,y1:Double,y2:Double){
        val distance= sqrt((x2 - x1)) *(x2-x1) + sqrt(y2-y1)*(y2-y1)
        println("Distance between these two points = $distance")
    }
}