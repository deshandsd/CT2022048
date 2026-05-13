package Q1;

public class Main {
    public static void main(String[] args) {

        double A = 7, B = 4, C = 2;
        double X = 15, Y = 4;
        double radius = 6;

        double expressionA = Math.sqrt(Math.pow(B, 2) + 4 * A * C);
        System.out.println("a = " + expressionA);

        double expressionB = Math.sqrt(X + 4 * Math.pow(Y, 3));
        System.out.println("b = " + expressionB);

        double expressionC = Math.cbrt(X * Y);
        System.out.println("c = " + expressionC);

        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("d = " + area);
    }
}