import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class FiboSeriesIte {
    public void fiboSeriesIte(int n, long startTime){
        long[] fib = new long[n]; // Array that stores the fibonacci sequence
        long currentLong = 1;
        long previousLong = 0;
        switch (n) {
            case 0: System.out.println("Nothing to see here"); // If user wants to see no elements
                    System.exit(0);

            case 1: fib[0] = previousLong;
                    System.out.println(Arrays.toString(fib)); // If user wants to see 1 element
                    System.exit(1);

            default: // If user wants to see more than 1 element
                    int position = 2; // Sets position to edit array at the third element after [0, 1...]
                    fib[1] = 1;
                    for (long i = n - 2; i > 0; i--){ // Adds elements to array after the array is [0, 1...]
                        fib[position] = currentLong + previousLong;
                        previousLong = currentLong;
                        currentLong = fib[position];

                        position++;

                    }
                    System.out.println(Arrays.toString(fib));
                    long endTime = System.nanoTime();
                    long elapsedTime = endTime - startTime;
                    double output = (double)elapsedTime / 1000000;

                System.out.println("(Ite) Since input, execution time in milliseconds took: " + output);
                    System.exit(2);
        }


    }
}
