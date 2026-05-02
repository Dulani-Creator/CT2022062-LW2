package Q9;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter investment amount in dollars (P): ");
        double p = scanner.nextDouble();

        System.out.print("Enter interest rate percentage (R): ");
        double r = scanner.nextDouble();

        System.out.print("Enter number of years (N): ");
        int n = scanner.nextInt();

        double amount = p * Math.pow(1 + (r / 100.0), n);

        System.out.printf("Amount of money earned after %d years: $%.2f\n", n, amount);

        scanner.close();
    }
}
