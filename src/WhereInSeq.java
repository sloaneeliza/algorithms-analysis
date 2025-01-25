import java.math.BigInteger;
import java.util.Scanner;

public class WhereInSeq {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer to find its position in the NotFibonacci sequence: ");
        BigInteger input = scanner.nextBigInteger();
        if (input.compareTo(BigInteger.ZERO) < 0) {
            System.out.println("Please enter a non-negative integer.");
            return;
        }
        int position = findNotFibonacciPosition(input);
        System.out.println("The position is: " + position);
    }

    private static int findNotFibonacciPosition(BigInteger input) {
        BigInteger prev1 = BigInteger.ONE;
        BigInteger prev2 = BigInteger.ZERO;

        if (input.equals(BigInteger.ZERO)){
            return 1;
        }
        if (input.equals(BigInteger.ONE)) {
            return 2;
        }
        int position = 2;

        while (true) {
            BigInteger current = prev1.multiply(BigInteger.valueOf(3))
                    .add(prev2.multiply(BigInteger.valueOf(2)));

            if (current.compareTo(input) == 0) {
                return position + 1;
            } else if (current.compareTo(input) > 0) {
                return position;
            }
            prev2 = prev1;
            prev1 = current;
            position++;
        }
    }
}
