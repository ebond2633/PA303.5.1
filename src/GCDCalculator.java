import java.util.Scanner;

public class GCDCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first positive integer: ");
        int a = scanner.nextInt();

        System.out.print("Enter the second positive integer: ");
        int b = scanner.nextInt();

        int gcd = calculateGCD(a, b);
        System.out.println("GCD = " + gcd);
    }

    // Recursive method to find the greatest common divisor
    static int calculateGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return calculateGCD(b, a % b);
        }
    }
}

