/*
 * 20. **Checking for Perfect Numbers**  
    **Difficulty**: Easy  
    **Topics**: Basic Programming, Number Theory  
    **Description**: Write a program to determine if a number is a perfect number.  
    **Example**:  
    Input: `number = 28`  
    Output: `Perfect Number`  
    Explanation: 28 is a perfect number because its divisors (1, 2, 4, 7, 14) sum up to 28.
 */

 import java.util.Scanner;

public class P20 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();

        int sum = 0;
        for(int i=1; i<=n; i++){
            if(n%i==0 && sum<n){
                sum = sum + i;
                // System.out.print(sum+" ");
            }
            
        }

        if(n==sum){
            System.out.print("Perfect Number");
        }else{
            System.out.print("Not a Perfect Number");
        }
            

        scanner.close();

    }
}
