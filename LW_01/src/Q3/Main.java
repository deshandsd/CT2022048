package Q3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first name :");
        String first = sc.nextLine();
        System.out.print("Enter first middle :");
        String middle = sc.nextLine();
        System.out.print("Enter first last :");
        String last = sc.nextLine();

        System.out.println(first + " " + middle.charAt(0) + "." + last);
    }
}
