package Q7;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("Enter an integer (- to stop): ");
            int num = sc.nextInt();

            if(num<0){
                System.out.println(("Stopping repetition."));
                break;
            }
            int length  = Integer.toString(num).length();
            System.out.println("The number " + num + " has " + length +" digits." );

        }
    }
}
