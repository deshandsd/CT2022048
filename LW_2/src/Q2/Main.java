package Q2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length in centimeters: ");
        double cm = input.nextDouble();

        double totalInches = cm / 2.54;
        int feet = (int) (totalInches / 12);
        double inches = totalInches % 12;

        System.out.printf("%.2f cm = %d ft %.2f in", cm, feet, inches);
        input.close();
    }
}
