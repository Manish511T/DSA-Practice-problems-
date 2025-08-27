/*
 * 21. **Calculating the Sum of Even Numbers in a Range**  
    **Difficulty**: Easy  
    **Topics**: Basic Programming, Mathematical Computations  
    **Description**: Write a program to find the sum of all even numbers within a given range.  
    **Example**:  
    Input: `range = [1, 10]`  
    Output: `30`  
    Explanation: The sum of even numbers between 1 and 10 is 2 + 4 + 6 + 8 + 10 = 30.  

 */


  import java.util.Scanner;

public class P21 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Starting number: ");
        int start = scanner.nextInt();
        System.out.println("Enter a Last number: ");
        int last = scanner.nextInt();
        int sum = 0;
        for(int i = start; i<=last; i++){
            if(i%2==0){
                sum = sum+i;
            }
        }

        System.out.println(sum);

        scanner.close();

    }
}