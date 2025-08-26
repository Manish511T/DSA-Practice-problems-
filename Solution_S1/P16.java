/*
 * 
16. **Finding the Sum of Elements in an Array**  
    **Difficulty**: Easy  
    **Topics**: Basic Programming, Arrays  
    **Description**: Write a program to find the sum of elements in an array.  
    **Example**:  
    Input: `array = [1, 2, 3, 4, 5]`  
    Output: `15`  
    Explanation: The sum of the elements in the array is 15.  

 */


 
import java.util.Scanner;

public class P16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter size of an array: ");
        int n = scanner.nextInt();
        System.out.print("Enter  numbers in an array: ");
        int[] arr = new int[n];
        int sum = 0, i;
        for(i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
        for(i=0; i<n; i++){
            sum += arr[i];
        }
        System.out.print(sum);

        scanner.close();
    }
}
