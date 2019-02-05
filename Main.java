import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        int n; // Stores user's choice for how many numbers they want
        Scanner in = new Scanner(System.in); // Object to get user input
        FiboSeriesIte fib = new FiboSeriesIte();

        System.out.print("How many numbers in the fibonacci would you like? : ");
        n = in.nextInt();
        long startTime = System.nanoTime();
        new FiboSeriesIte().fiboSeriesIte(n, startTime);
        // new FiboSeriesRec().fiboSeriesRec(n, startTime);

    }
}
