/*
 * 28. **Finding the Sum of the Digits of the Factorial of a Number**  
    **Difficulty**: Easy  
    **Topics**: Basic Programming, Mathematical Computations  
    **Description**: Write a program to find the sum of the digits of the factorial of a given number.  
    **Example**:  
    Input: `number = 4`  
    Output: `6`  
    Explanation: The factorial of 4 is 24, and the sum of the digits (2 + 4) is 6. 
 */


import java.util.Scanner;

public class P28 {

    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();
        int  factorial = factorial(n);
        System.out.println("The Factorial of "+n+ " is "+factorial);
        int sum = 0;
        while(factorial!=0){
            sum = sum + factorial%10;
            factorial = factorial/10;
        }

        System.out.print("The sum of the digits of the factorial of a given number "+sum);
        scanner.close();

    }
}