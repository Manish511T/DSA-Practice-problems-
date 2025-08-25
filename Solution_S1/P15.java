/*
 * 15. **Sorting an Array**  
    **Difficulty**: Easy  
    **Topics**: Basic Programming, Sorting Algorithms  
    **Description**: Write a program to sort an array of numbers in ascending order.  
    **Example**:  
    Input: `array = [3, 1, 4, 1, 5, 9]`  
    Output: `[1, 1, 3, 4, 5, 9]`  
    Explanation: The array sorted in ascending order is [1, 1, 3, 4, 5, 9].  

 */

import java.util.Scanner;

public class P15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter size of an array: ");
        int n = scanner.nextInt();
        System.out.print("Enter  numbers in an array: ");
        int[] arr = new int[n];
        int i, j;
        for (i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }

        scanner.close();
    }
}
