//Question 3
import java.util.Scanner;
import java.math.BigInteger;

public class NotFib {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms in the NotFibonacci sequence: ");
        int terms = scanner.nextInt();

        if (terms <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }
        generateNotFibonacci(terms);
    }

    private static void generateNotFibonacci(int terms) {
        BigInteger[] sequence = new BigInteger[terms];
        sequence[0] = BigInteger.ZERO;
        if (terms > 1) {
            sequence[1] = BigInteger.ONE;
        }

        for (int i = 2; i < terms; i++) {
            sequence[i] = sequence[i - 1].multiply(BigInteger.valueOf(3))
                    .add(sequence[i - 2].multiply(BigInteger.valueOf(2)));
        }

        System.out.println("NotFibonacci sequence:");
        for (int i = 0; i < terms; i++) {
            System.out.print(sequence[i] + " ");
        }
        System.out.println();
    }
}
