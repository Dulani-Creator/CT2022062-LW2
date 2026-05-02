package Q8;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the sphere (r): ");
        double r = scanner.nextDouble();

        double volume = (4.0 / 3.0) * (Math.PI * Math.pow(r, 3));

        System.out.printf("The volume of the sphere is: %.2f\n", volume);

        scanner.close();
    }
}
