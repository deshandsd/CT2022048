package Q7;

import javax.swing.JFrame;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        JFrame myWindow = new JFrame();
        String time = LocalTime.now().format(DateTimeFormatter.ofPattern("hh:mm:ss a"));
        myWindow.setSize(800, 600);
        myWindow.setTitle(time);
        myWindow.setVisible(true);
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}