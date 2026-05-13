package Q9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Principal amount (P): ");
        double P = input.nextDouble();
        System.out.print("Enter Annual interest rate (R in %): ");
        double R = input.nextDouble();
        System.out.print("Enter Number of years (N): ");
        int N = input.nextInt();

        double amount = P * Math.pow(1 + (R / 100), N);
        System.out.printf("Amount of money earned after %d years = %.2f", N, amount);
        input.close();
    }
}