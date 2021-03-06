import java.util.*;
class PowersOfTwo {
    public static void main(String args[]) {

        // read in one command-line argument
        int n = Integer.parseInt(args[0]);

        int i = 0;                // count from 0 to N
        int powrOfTwo = 1;       // the ith power of two

        // repeat until i equals n
        while (i <= n) {
            System.out.println(i + " " + powrOfTwo);   // print out the power of two
            powrOfTwo = 2 * powrOfTwo;                // double to get the next one
            i = i + 1;
        }

    }
}
