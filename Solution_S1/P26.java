/*
 * 26. **Checking if a Number is a Narcissistic Number**  
    **Difficulty**: Easy  
    **Topics**: Basic Programming, Number Theory  
    **Description**: Write a program to check if a number is a narcissistic number (where the sum of its digits raised to the power of the number of digits equals the number itself).  
    **Example**:  
    Input: `number = 153`  
    Output: `Narcissistic Number`  
    Explanation: 153 is a narcissistic number because 1^3 + 5^3 + 3^3 = 153.
 */

import java.util.Scanner;

public class P26 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();
        int power = 0;
        int copy = n;

        if (copy == 0) {
            power = 1;
        } else {
            while (copy != 0) {
                copy = copy / 10;
                power++;
            }
        }

        copy = n;
        int n1=0;
        while(copy!=0){
            int digit = copy%10;
            int result = 1;
            for(int i=0; i<power; i++){
                result *= digit;
            }
            n1 += result;
            
            copy = copy/10;
        }

        if(n==n1){
            System.out.println("Narcissistic Number");
        }else{
            System.out.println("is not Narcissistic Number");
        }
        

        scanner.close();

    }
}