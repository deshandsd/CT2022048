package Q10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Loan amount: ");
        double loanAmount = input.nextDouble();
        System.out.print("Annual interest rate (%): ");
        double annualRate = input.nextDouble();
        System.out.print("Loan period (years): ");
        int loanPeriod = input.nextInt();

        double monthlyInterestRate = annualRate / 100.0 / 12;
        int numberOfPayments = loanPeriod * 12;

        double monthlyPayment = (loanAmount * monthlyInterestRate)
                / (1 - Math.pow(1 / (1 + monthlyInterestRate), numberOfPayments));
        double totalPayment = monthlyPayment * numberOfPayments;

        System.out.printf("Monthly payment: %.2f%n", monthlyPayment);
        System.out.printf("Total payment: %.2f", totalPayment);
        input.close();
    }
}
