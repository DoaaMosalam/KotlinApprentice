package KotlinExercises.ChapterOne

/*A circle is made up of 2𝜋 radians, corresponding with 360 degrees. Declare a
constant degrees of type Double and assign it an initial value. Calculate the
corresponding angle in radians and store the result in a constant named radians.
طول قوس الدائرة = نصف قطر الدائرة×زاوية القوس بالراديان.
 2×π×نصف قطر الدائرة×زاوية القوس/360

*/
fun main(args: Array<String>) {
    val a:Double=45.0
    val radians:Double = 2*Math.PI*12*a/360
    println("The length of the circle arc= $radians")
}