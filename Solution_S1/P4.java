/*
  4. **Calculating Armstrong Numbers**  
   **Difficulty**: Easy  
   **Topics**: Basic Programming, Number Theory  
   **Description**: Write a program to check if a number is an Armstrong number.  
   **Example**:  
   Input: `number = 153`  
   Output: `Armstrong Number`  
   Explanation: 153 is an Armstrong number because 1^3 + 5^3 + 3^3 = 153.  
 */

import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

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

        // check Armstrong condition
        if (n == n1) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }

        scanner.close();
    }
}
