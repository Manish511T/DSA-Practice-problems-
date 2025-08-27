/*
 * 22. **Calculating the Sum of Odd Numbers in a Range**  
    **Difficulty**: Easy  
    **Topics**: Basic Programming, Mathematical Computations  
    **Description**: Write a program to find the sum of all odd numbers within a given range.  
    **Example**:  
    Input: `range = [1, 10]`  
    Output: `25`  
    Explanation: The sum of odd numbers between 1 and 10 is 1 + 3 + 5 + 7 + 9 = 25.  

 */


 
  import java.util.Scanner;

public class P22 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Starting number: ");
        int start = scanner.nextInt();
        System.out.println("Enter a Last number: ");
        int last = scanner.nextInt();
        int sum = 0;
        for(int i = start; i<=last; i++){
            if(i%2!=0){
                sum = sum+i;
            }
        }

        System.out.println(sum);

        scanner.close();

    }
}