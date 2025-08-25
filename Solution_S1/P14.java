/*
 * 14. **Finding the Largest and Smallest Numbers in an Array**  
    **Difficulty**: Easy  
    **Topics**: Basic Programming, Arrays  
    **Description**: Write a program to find the largest and smallest numbers in an array.  
    **Example**:  
    Input: `array = [4, 7, 1, 8, 5]`  
    Output: `Largest: 8, Smallest: 1`  
    Explanation: The largest number in the array is 8 and the smallest is 1.  

 */

import java.util.Scanner;

public class P14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter  numbers in an array: ");
        int[] arr =new int[5];

        for(int i=0; i<5; i++){
            arr[i] = scanner.nextInt();
        }

        int Largest = arr[0], Smallest = arr[0];
        for(int i=1; i<5; i++){
            if(arr[i]>Largest){
                Largest = arr[i];
            }
            if(arr[i]<Smallest){
                Smallest = arr[i];
            }
        }

        System.out.print("Largest: "+Largest+" ,Smallest: "+Smallest);


        scanner.close();
    }
}
