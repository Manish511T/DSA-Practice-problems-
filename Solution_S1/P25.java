/*
 * 25. **Finding the Number of Digits in a Number**  
    **Difficulty**: Easy  
    **Topics**: Basic Programming, Mathematical Computations  
    **Description**: Write a program to count the number of digits in a given number.  
    **Example**:  
    Input: `number = 12345`  
    Output: `5`  
    Explanation: The number 12345 has 5 digits. 
 */

 import java.util.Scanner;

public class P25 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();
        int count =0;
        while(n!=0){
            n=n/10;
            count++;
        }

        System.out.print(count);

        scanner.close();

    }
}