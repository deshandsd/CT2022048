package Q11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your first middle last name :");
        String name = sc.nextLine();
        String[] names = name.split(" ");
        System.out.println(names[2]+","+names[0]+" "+names[1].charAt(0)+".");
    }
}
