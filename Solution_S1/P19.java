/*
 * 19. **Finding Prime Numbers in a Range**  
    **Difficulty**: Easy  
    **Topics**: Basic Programming, Number Theory  
    **Description**: Write a program to find all prime numbers within a given range.  
    **Example**:  
    Input: `range = [10, 30]`  
    Output: `[11, 13, 17, 19, 23, 29]`  
    Explanation: Prime numbers between 10 and 30 are 11, 13, 17, 19, 23, and 29.  

 */

import java.util.Scanner;

public class P19 {

    static int prime(int n){
        for(int i = 2; i<n-1; i++){
            if(n%i==0){
                return -1;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Starting number: ");
        int start = scanner.nextInt();
        System.out.println("Enter a Last number: ");
        int last = scanner.nextInt();

        for(int i = start; i<last; i++){
            if(prime(i)==i){
                System.out.print(i+" ");
            }
        }
        scanner.close();

    }
}
