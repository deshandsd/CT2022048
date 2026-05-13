package Q1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter integer 01: ");
        int n1 = input.nextInt();
        System.out.print("Enter integer 02: ");
        int n2 = input.nextInt();
        System.out.print("Enter integer 03: ");
        int n3 = input.nextInt();

        int smallest = n1;
        if (n2 < smallest) smallest = n2;
        if (n3 < smallest) smallest = n3;

        System.out.println("The smallest number is : " + smallest);
    }
}
