package chapterOne.KotlinExercises.ChapterOne
/*A temperature expressed in °C can be converted to °F by multiplying by 1.8 then
incrementing by 32. In this challenge, do the reverse: convert a temperature from °F
to °C. Declare a constant named fahrenheit of type Double and assign it a value.
Calculate the corresponding temperature in °C and store the result in a constant
named celcius.*/
fun main(args: Array<String>) {
    val c:Double=80.0
    val fahrenheit:Double =2412.34
    val celcius:Double =(c-32)*5/9
    println("celcius $celcius")


}