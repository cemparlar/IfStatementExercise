import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {

        //We request inputs for principal, annual interest rate and loan period to calculate the mortgage
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Principal amount ($1K - $1M): ");
        double principal = sc.nextDouble();
        while(!(principal >= 1000 && principal <= 1000000)) {
            System.out.println("Enter a value between 1,000 and 1,000,000.");
            System.out.print("Principal: ");
            principal = sc.nextDouble();
        }
        System.out.print("Enter the Annual Interest Rate: ");
        //Input is a percentage value (e.g. 3.50%) for the annual interest rate
        //Thus, it is converted to fractional monthly value
        double annualInterestRate = sc.nextDouble();
        while(!(annualInterestRate > 0 && annualInterestRate <= 30)) {
            System.out.println("Enter a value greater than 0 and less than or equal to 30");
            System.out.print("Annual Interest Rate: ");
            annualInterestRate = sc.nextDouble();
        }
        double monthlyRate = (annualInterestRate / 100) / 12;

        System.out.print("Enter the Period(Years): ");
        int periodYears = sc.nextInt();
        while(!(periodYears >= 1 && periodYears <= 30)) {
            System.out.println("Enter a value between 1 and 30");
            System.out.print("Period(Years): ");
            periodYears = sc.nextInt();
        }
        double numberOfPayments = periodYears*12;
        //Now that we have all the required variables for the calculation
        double mortgage = principal*((monthlyRate*(Math.pow((1.0+monthlyRate),numberOfPayments)))/((Math.pow((1.0+monthlyRate),numberOfPayments))-1));
        System.out.println("The mortgage to be paid monthly is: ");
        System.out.format("$%.2f", mortgage);

    }



}
