import java.util.Scanner;
//Version with Scanner
public class IfStatementExerciseTwo {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Number: ");
        double input = read.nextDouble();

        if(input%5 == 0 && input%3 == 0)
            System.out.println("FizzBuzz");
            //If the input is divisible by 5, print "Fizz"
        else if(input%5 == 0)
            System.out.println("Fizz");
            //If the input is divisible by 3, print "Buzz"
        else if(input%3 == 0)
            System.out.println("Buzz");
            //If the input is not divisible by either 3 or 5, print the number as integer
        else
            System.out.println((int) input);

    }
}
