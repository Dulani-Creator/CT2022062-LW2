package Q2;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length in centimeters: ");
        double cm = scanner.nextDouble();


        double totalInches = cm / 2.54;


        int feet = (int) (totalInches / 12);


        double remainingInches = totalInches % 12;

        System.out.printf("%.2f cm is %d feet and %.2f inches.\n", cm, feet, remainingInches);

        scanner.close();
    }
}
