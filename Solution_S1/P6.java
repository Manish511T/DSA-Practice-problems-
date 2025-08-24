/*
 6. **Identifying Palindromes**  
   **Difficulty**: Easy  
   **Topics**: Basic Programming, String Manipulation  
   **Description**: Write a program to check if a string or number is a palindrome.  
   **Example**:  
   Input: `string = "radar"`  
   Output: `Palindrome`  
   Explanation: "radar" reads the same backward as forward. 
 */

import java.util.Scanner;

public class P6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String string = scanner.nextLine();
        boolean flag = true;
        int n = string.length();

        for(int i=0; i<n/2; i++){
            if(string.charAt(i)!=string.charAt(n-i-1)){
                flag = false;
                break;
            }
        }

        if(flag==true){
            System.out.print(string+" is Palindrome");
        }else{
            System.out.print(string+"  is not a Palindrome");
        }

        scanner.close();
    }
}
