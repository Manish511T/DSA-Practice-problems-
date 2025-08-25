/*
 * 11. **Finding the Least Common Multiple (LCM)**  
    **Difficulty**: Easy  
    **Topics**: Basic Programming, Number Theory  
    **Description**: Write a program to find the LCM of two numbers.  
    **Example**:  
    Input: `a = 12, b = 15`  
    Output: `60`  
    Explanation: The LCM of 12 and 15 is 60. 
 */

 import java.util.Scanner;

public class P11 {
    static int GCD(int a, int b){
        if(a%b == 0){
            return b;
        }else{
            return GCD(b, a%b);
        }
    }

    static int LCM(int a, int b){
        return (a*b)/GCD(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n1 number: ");
        int a = scanner.nextInt();
        System.out.print("Enter n2 number: ");
        int b = scanner.nextInt();
        System.out.print(LCM(a, b));        
        
        scanner.close();
    }
}
