package Q8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your sentence with !:");
        String input = sc.nextLine();

        String[] parts = input.split("!");
        for (String part : parts) System.out.println(part);
    }
}
