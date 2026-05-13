package Q10;

import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your word: ");
        String word = sc.nextLine().toLowerCase();

        String rev = new StringBuilder(word).reverse().toString();

        if(word.equals(rev)){
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("IT is not palindrome");
        }

    }
}
