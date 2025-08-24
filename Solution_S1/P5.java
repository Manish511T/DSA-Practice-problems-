/*
5. **Generating the Fibonacci Series**  
   **Difficulty**: Easy  
   **Topics**: Basic Programming, Sequences  
   **Description**: Write a program to generate the Fibonacci series up to a given number.  
   **Example**:  
   Input: `limit = 10`  
   Output: `[0, 1, 1, 2, 3, 5, 8]`  
   Explanation: The Fibonacci series up to 10 is generated as [0, 1, 1, 2, 3, 5, 8].  
*/


import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=scanner.nextInt();
        int n1=0, n2=1, n3;

        for(int i=0; i<n; i++){
            System.out.print(n1+" ");
            n3 = n2 + n1;
            n1 = n2;
            n2 = n3;

            if(n1>n){
                break;
            }
        }
        scanner.close();
    }
}

