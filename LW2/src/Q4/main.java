package Q4;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight in pounds: ");
        double weight = scanner.nextDouble();


        double calories = weight * 19;

        System.out.println("You need " + calories + " calories in one day.");

        scanner.close();
    }
}
