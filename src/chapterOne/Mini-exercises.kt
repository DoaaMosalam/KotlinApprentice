package chapterOne

fun main(args: Array<String>) {
    /*1. Declare a constant of type Int called myAge and set it to your age.*/
     val myAge:Int=30

    println(myAge)
//===========================================================================================
    /* Declare a variable of type Double called averageAge. Initially, set it to your own age.
Then, set it to the average of your age and my own age of 30.*/
    var averageAge:Double=25.0
    averageAge=30.0
//================================================================================================
    /*Create a constant called testNumber and initialize it with whatever integer you’d
like. Next, create another constant called evenOdd and set it equal to testNumber
modulo 2. Now change testNumber to various numbers. What do you notice about
evenOdd?*/
    val testNumber:Int=10
    var evenOdd:Int=testNumber
    //Error
    //testNumber=20
//================================================================================================
    /*Create a variable called answer and initialize it with the value 0. Increment it by 1.
Add 10 to it. Multiply it by 10. Then, shift it to the right by 3. After all of these
operations, what’s the answer?*/
    val answer=0
    answer+1
    answer+10
    answer*10
    println(answer)


}
