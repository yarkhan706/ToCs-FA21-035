import java.util.Scanner;

public class SquareCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int square = number * number;
        System.out.println("The square of " + number + " is: " + square);

        scanner.close();
    }
}
