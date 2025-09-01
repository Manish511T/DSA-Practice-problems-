/*
 * 30. **Finding Missing Numbers in a Sequence**  
    **Difficulty**: Easy  
    **Topics**: Basic Programming, Arrays  
    **Description**: Write a program to find missing numbers in a sequence from 1 to n.  
    **Example**:  
    Input: `sequence = [1, 2, 4, 5]`  
    Output: `[3]`  
    Explanation: The missing number in the sequence from 1 to 5 is 3. 
 */

 
import java.util.Scanner;

public class P30 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1,2,3,4,6,7,8};
        int ans=0;
        for(int i = 0; i<arr.length; i++){
            ans = ans ^arr[i];
        }
        for(int i = 1; i<=arr.length+1; i++){
            ans = ans^i;
        }
        System.out.println(ans);
        scanner.close();

    }
}