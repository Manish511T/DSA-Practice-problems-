/*
 * 9. **Summing Digits of a Number**  
   **Difficulty**: Easy  
   **Topics**: Basic Programming, Mathematical Computations  
   **Description**: Write a program to calculate the sum of digits of a number.  
   **Example**:  
   Input: `number = 1234`  
   Output: `10`  
   Explanation: The sum of the digits 1 + 2 + 3 + 4 = 10.  
 */

import java.util.Scanner;

public class P9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int result=0;
        while(n>0){
            int digit = n%10;
            result = result + digit;
            n = n/10;
        }

        System.out.print("Ans is "+ result);
        scanner.close();
    }
}
