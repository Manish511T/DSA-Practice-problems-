/*
 *  **Difficulty**: Easy  
    **Topics**: Basic Programming, String Manipulation  
    **Description**: Write a program to reverse a given string.  
    **Example**:  
    Input: `string = "programming"`  
    Output: `"gnimmargorp"`  
    Explanation: The reversed string of "programming" is "gnimmargorp".  

 */


 import java.util.Scanner;

public class P13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scanner.nextLine();
        int n = s.length();
        for(int i=n-1; i>=0; i--){
            System.out.print(s.charAt(i));
        }
        scanner.close();
    }
}
