
/*
 * 7. **Crafting Star Patterns**  
   **Difficulty**: Easy  
   **Topics**: Basic Programming, Patterns  
   **Description**: Write a program to create different star patterns (e.g., pyramid, diamond).  
   **Example**:  
   Input: `patternType = "pyramid", height = 5`  
   Output:  
   ```
       *
      ***
     *****
    *******
   *********
   ```  
   Explanation: A pyramid pattern with a height of 5 is generated.
 */


import java.util.Scanner;

public class P7 {
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
