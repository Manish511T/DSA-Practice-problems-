/*
 * 17. **Checking for Armstrong Numbers in a Range**  
    **Difficulty**: Easy  
    **Topics**: Basic Programming, Number Theory  
    **Description**: Write a program to find all Armstrong numbers within a given range.  
    **Example**:  
    Input: `range = [1, 500]`  
    Output: `[1, 153, 370, 371, 407]`  
    Explanation: Armstrong numbers between 1 and 500 are 1, 153, 370, 371, and 407. 
 */

import java.util.Scanner;

public class P17 {

    static int armstrong(int n) {
        int power = 0;

        // count digits
        int copy = n;
        if (copy == 0) {
            power = 1;
        } else {
            while (copy != 0) {
                copy = copy / 10;
                power++;
            }
        }

        int n1 = 0;

        // calculate Armstrong sum
        copy = n;
        while (copy != 0) {
            int digit = copy % 10;

            int result = 1; // reset for each digit
            for (int i = 0; i < power; i++) {
                result *= digit; // digit ^ power
            }

            n1 += result;
            copy = copy / 10;
        }

        return n1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter range to find Armstrong: ");
        System.out.println("Input starting point: ");
        int start = scanner.nextInt();
        System.out.println("Input last point: ");
        int last = scanner.nextInt();

        for (int i = start; i <= last; i++) {
            if (armstrong(i) == i) { // check if Armstrong
                System.out.print(i + " ");
            }
        }

        scanner.close();

    }
}
