/*
 * 10. **Finding the Greatest Common Divisor (GCD)**  
    **Difficulty**: Easy  
    **Topics**: Basic Programming, Number Theory  
    **Description**: Write a program to find the GCD of two numbers.  
    **Example**:  
    Input: `a = 48, b = 18`  
    Output: `6`  
    Explanation: The GCD of 48 and 18 is 6.
 */
import java.util.Scanner;

public class P10 {

    static int GCD(int n1, int n2){
        if(n1%n2==0){
            return n2;
        }else{
            return GCD(n2, n1%n2);
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n1 number: ");
        int n1 = scanner.nextInt();
        System.out.print("Enter n2 number: ");
        int n2 = scanner.nextInt();
        System.out.print(GCD(n1, n2));
        scanner.close();
    }
}
