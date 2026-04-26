package Q9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your sentence :");
        String input = sc.nextLine();
        System.out.println(input.length());
        System.out.println(input.charAt(0));
        System.out.println(input.charAt(input.length() -1));
    }
}
