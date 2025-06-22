package JavaExercises.ChapterOne;
/*
* Declare a constant exercises with value 9 and a variable exercisesSolved with
value 0. Increment this variable every time you solve an exercise (including this
one).
* */
class exercise_1 {
    public void exercisesOne(){
        final int EXERCISES = 9; // Declare a constant for the total number of exercises
        int exercisesSolved = 0;
        // Increment the variable every time an exercise is solved
        exercisesSolved++;
        System.out.println("Total exercises: " + EXERCISES);
        System.out.println("Exercises solved: " + exercisesSolved);
    }

    public static void main(String[] args) {
        exercise_1 ex = new exercise_1();
        ex.exercisesOne();
    }

}
