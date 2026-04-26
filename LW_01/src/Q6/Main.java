package Q6;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Window name: ");
        String Windowname = scanner.nextLine();

        System.out.print("Enter Window height: ");
        int Window_height = scanner.nextInt();

        System.out.print("Enter Window width: ");
        int Window_width = scanner.nextInt();


        JFrame myWindow = new JFrame();
        myWindow.setSize(Window_width, Window_height);
        myWindow.setTitle(Windowname);
        myWindow.setVisible(true);
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}