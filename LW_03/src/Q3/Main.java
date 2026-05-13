package Q3;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a power of 10 (6, 9, 12, 15, 18, 21, 30, 100): ");
        int power = scanner.nextInt();

        switch(power){
            case 6 -> System.out.println("Million");
            case 9 -> System.out.println("Billion");
            case 12 -> System.out.println("Trillion");
            case 15 -> System.out.println("Quadrillion");
            case 18 -> System.out.println("Quintillion");
            case 21 -> System.out.println("Sextillion");
            case 30 -> System.out.println("Nonillion");
            case 100 -> System.out.println("Googol");
            default -> System.out.println("No Word for this input.");
        }
    }
}
