import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class FiboSeriesRec {
    public void fiboSeriesRec(int n, long startTime){
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

                fibRecCalc(n, fib, position, currentLong, previousLong);


                System.out.println(Arrays.toString(fib));
                long endTime = System.nanoTime();
                long elapsedTime = endTime - startTime;
                double output = (double)elapsedTime / 1000000;

                System.out.println("(Rec) Since input, execution time in milliseconds took: " + output);
                System.exit(2);
        }


    }

    public static long[] fibRecCalc(int n, long[] fib, int position, long currentInt, long previousInt){
        if ((n-2) > 0){

            fib[position] = currentInt + previousInt;
            previousInt = currentInt;
            currentInt = fib[position];

            position++;
            n--;
            fib = fibRecCalc(n, fib, position, currentInt, previousInt);
        }
        return fib;

    }
}

