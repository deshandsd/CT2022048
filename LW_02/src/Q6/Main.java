package Q6;

import java.util.Scanner;
import java.time.Year;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your birth year: ");
        int birthYear = input.nextInt();

        int currentYear = Year.now().getValue();
        int age = currentYear - birthYear;

        System.out.printf("You were born in %d and will be %d this year.", birthYear, age);
        input.close();
    }
}