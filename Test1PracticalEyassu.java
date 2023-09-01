import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test1PracticalEyassu {

    public static void main(String[] args) {
        System.out.println("Million Eyassu - Loan Amortization Schedule"); // Title
        System.out.println("Class - IT-161-400" + '\n'); // Class

        // declarations 
        double dblLoanAmount = ReadFloatFromUser("Enter Loan Amount: "); // Read loan amount from the user        
        int intNumberOfYears = ReadIntegerFromUser("Enter Number of Years: "); // Read number of years from the user        
        double dblAnnualInterestRate = ReadFloatFromUser("Enter Annual Interest Rate: "); // Read annual interest rate from the user        
        double dblMonthlyRate = dblAnnualInterestRate / 1200; // Calculate monthly interest rate        
        double dblMonthlyPayment = dblLoanAmount * dblMonthlyRate / (1 - 1 / Math.pow(1 + dblMonthlyRate, intNumberOfYears * 12)); // Calculate monthly payment        
        double dblTotalPayment = dblMonthlyPayment * 12 * intNumberOfYears; // Calculate total payment        
        

        System.out.printf("Monthly Payment: %.2f%n", dblMonthlyPayment); // Displays Monthly Payment
        System.out.printf("Total Payment: %.2f%n", dblTotalPayment); // Displays Total Payment
        System.out.println("Payment#\tInterest\tPrincipal\tBalance"); // Display amortization schedule


        double dblBalance = dblLoanAmount; // Sets balance on account

        // calculates interest and monthly payments
        for (int intPaymentNumber = 1; intPaymentNumber <= intNumberOfYears * 12; intPaymentNumber++) {
            double dblInterest = dblBalance * dblMonthlyRate;
            double dblPrincipal = dblMonthlyPayment - dblInterest;
            dblBalance -= dblPrincipal;
            System.out.printf("%-12d\t%-12.2f\t%-12.2f\t%.2f%n", intPaymentNumber, dblInterest, dblPrincipal, dblBalance);
        }
    }

    // ----------------------------------------------------------------------
    // Name: ReadIntegerFromUser
    // Abstract: Read an integer from the user
    // ----------------------------------------------------------------------
    public static int ReadIntegerFromUser(String strPrompt) {
        int intValue = 0;
        try {
            String strBuffer = "";
            BufferedReader burInput = new BufferedReader(new InputStreamReader(System.in));
            System.out.print(strPrompt);
            strBuffer = burInput.readLine();
            intValue = Integer.parseInt(strBuffer);
        } catch (Exception excError) {
            System.out.println(excError.toString());
        }
        return intValue;
    }

    // ----------------------------------------------------------------------
    // Name: ReadFloatFromUser
    // Abstract: Read a float from the user
    // ----------------------------------------------------------------------
    public static double ReadFloatFromUser(String strPrompt) {
        double dblValue = 0;
        try {
            String strBuffer = "";
            BufferedReader burInput = new BufferedReader(new InputStreamReader(System.in));
            System.out.print(strPrompt);
            strBuffer = burInput.readLine();
            dblValue = Double.parseDouble(strBuffer);
        } catch (Exception excError) {
            System.out.println(excError.toString());
        }
        return dblValue;
    }
}
