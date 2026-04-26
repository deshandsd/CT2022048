package Q10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your odd word :");
        String input = sc.nextLine();

        System.out.println(input.charAt(input.length() / 2));
    }
}
