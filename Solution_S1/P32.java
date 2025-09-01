/*
 * 32. **Finding the Median of an Array**  
    **Difficulty**: Medium  
    **Topics**: Arrays, Sorting  
    **Description**: Write a program to find the median of an array of numbers.  
    **Example**:  
    Input: `array = [3, 1, 2, 4, 5]`  
    Output: `3`  
    Explanation: The median of the sorted array [1, 2, 3, 4, 5] is 3.  
 */

import java.util.Scanner;

public class P32 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = { 3, 1, 2, 4, 5 };
        // sorting
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i + 1 != arr.length) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }

        }

        if(arr.length%2==0){
            System.out.print(arr[(arr.length+1)/2]);
        }else{
            System.out.print(arr[arr.length/2]);
        }
        scanner.close();

    }
}
