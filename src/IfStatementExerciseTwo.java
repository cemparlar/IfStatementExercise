import java.util.Scanner;
//Version with Scanner
public class IfStatementExerciseTwo {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Number: ");
        double input = read.nextDouble();

        if(input%5 == 0 && input%3 == 0)
            System.out.println("The number " + (int) input + " is divisible by both 5 and 3.");
        else if(input%5 == 0)
            System.out.println("The number " + (int) input + " is divisible by 5, but not 3.");
        else if(input%3 == 0)
            System.out.println("The number " + (int) input + " is divisible by 3, but not 5.");
        else
            System.out.println("The number " + (int) input + " is neither divisible by 5 or 3.");
    }
}
