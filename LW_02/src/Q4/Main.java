package Q4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter body weight in pounds: ");
        double weight = input.nextDouble();

        double calories = weight * 19;
        System.out.printf("Daily calories needed: %.2f", calories);
        input.close();
    }
}
