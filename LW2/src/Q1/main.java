package Q1;

public class main {
    public static void main(String[] args) {

        double A = 2, B = 5, C = 1;
        double X = 10, Y = 3;
        double radius = 7;


        double resultA = Math.sqrt(Math.pow(B, 2) + 4 * A * C);
        System.out.println("Result of a: " + resultA);


        double resultB = Math.sqrt(X + 4 * Math.pow(Y, 3));
        System.out.println("Result of b: " + resultB);


        double resultC = Math.cbrt(X * Y);
        System.out.println("Result of c: " + resultC);


        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Area of the circle: " + area);
    }
}
