public class IfStatementExercise {
    //Version without Scanner
    public static void main(String[] args) {
        double input = Double.parseDouble(args[0]);

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
