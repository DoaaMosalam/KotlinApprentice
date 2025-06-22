package KotlinExercises.ChapterOne
/*Declare a constant exercises with value 9 and a variable exercisesSolved with
value 0. Increment this variable every time you solve an exercise (including this
one)*/
class exerciseOne{
    fun exercise(){
        val exercise=9
        var exercisesSolved=0

        var result = exercisesSolved++
        println(exercise)
        println(result)
    }
}
fun main() {
 val ex = exerciseOne()
    ex.exercise()

}