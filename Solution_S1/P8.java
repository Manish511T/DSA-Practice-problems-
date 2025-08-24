
/*
 * 8. **Finding the Factorial of a Number**  
   **Difficulty**: Easy  
   **Topics**: Basic Programming, Mathematical Computations  
   **Description**: Write a program to compute the factorial of a given number.  
   **Example**:  
   Input: `number = 5`  
   Output: `120`  
   Explanation: 5! (factorial) is 5 × 4 × 3 × 2 × 1 = 120.  
 */

import java.util.Scanner;

public class P8 {

    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }else{
           return n*factorial(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int result = factorial(n);
        System.out.print(result);
        scanner.close();
    }
}
