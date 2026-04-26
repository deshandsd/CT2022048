package Q2;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String Firstname = scanner.nextLine();


        System.out.print("Enter your first name: ");
        String Lastname = scanner.nextLine();

        String Fullname = Firstname + " " + Lastname;

        JFrame myWindow = new JFrame();
        myWindow.setSize(800, 600);
        myWindow.setTitle(Fullname);
        myWindow.setVisible(true);
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}