package JavaExercises.ChapterOne;
/*
* Declare two constants a and b of type Double and assign both a value. Calculate the
average of a and b and store the result in a constant named average.
* */
public class Calculate_average {
    public void calculateAverage() {

        final double a = 10.0;
        final double b = 20.0;
        final double average = (a+b)/2;
        System.out.println("The average of " + a + " and " + b + " is: " + average);
    }

    public static void main(String[] args) {
        Calculate_average calcAvg = new Calculate_average();
        calcAvg.calculateAverage();
    }
}
