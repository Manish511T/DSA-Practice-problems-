/*
 * 23. **Finding the Fibonacci Number at a Specific Position**  
    **Difficulty**: Easy  
    **Topics**: Basic Programming, Sequences  
    **Description**: Write a program to find the Fibonacci number at a specific position.  
    **Example**:  
    Input: `position = 5`  
    Output: `5`  
    Explanation: The Fibonacci number at position 5 is 5 (sequence: 0, 1, 1, 2, 3, 5).  
 */

   import java.util.Scanner;

public class P23 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a position number: ");
        int n = scanner.nextInt();

        int n1 =0, n2=1, temp=0;
        for(int i=0; i<n; i++){
            // System.out.print(n1+" ");
            temp = n1+n2;
            n1 = n2;
            n2 = temp;

            if(i==n){
                break;
            }
        }
        System.out.println(n1);
        
        scanner.close();

    }
}