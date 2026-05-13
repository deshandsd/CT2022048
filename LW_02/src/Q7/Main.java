package Q7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight (kg): ");
        int weight = input.nextInt();
        System.out.print("Enter height (cm): ");
        int height = input.nextInt();

        double bmi = weight / Math.pow(height / 100.0, 2);
        System.out.printf("BMI = %.2f", bmi);
        input.close();
    }
}
