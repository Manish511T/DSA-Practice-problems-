/*
 * 24. **Printing Prime Numbers Less Than a Given Number**  
    **Difficulty**: Easy  
    **Topics**: Basic Programming, Number Theory  
    **Description**: Write a program to print all prime numbers less than a given number.  
    **Example**:  
    Input: `number = 20`  
    Output: `2, 3, 5, 7, 11, 13, 17, 19`  
    Explanation: The prime numbers less than 20 are 2, 3, 5, 7, 11, 13, 17, and 19.  

 */

import java.util.Scanner;

public class P24 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();

        for (int i = 2; i < n; i++) {
            boolean flag = true;
            for (int j = 2; j < i - 1; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }

            }

            if(flag){
                System.out.print(i+" ");
            }

        }

        scanner.close();

    }
}