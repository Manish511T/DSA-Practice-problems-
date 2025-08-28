/*
 * 27. **Generating a Pattern of Numbers**  
    **Difficulty**: Easy  
    **Topics**: Basic Programming, Patterns  
    **Description**: Write a program to generate number patterns (e.g., sequential numbers in a matrix).  
    **Example**:  
    Input: `rows = 3`  
    Output:  
    ```
    1  
    2 3  
    4 5 6  
    ```  
    Explanation: A number pattern with 3 rows is generated.  

 */


import java.util.Scanner;

public class P27 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();
        int num =1;
        for(int i=1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(num +" ");
                num ++;
            }
            System.out.println();
        }
        scanner.close();

    }
}