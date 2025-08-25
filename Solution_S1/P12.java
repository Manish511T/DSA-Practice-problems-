/*
 * 12. **Counting Vowels and Consonants in a String**  
    **Difficulty**: Easy  
    **Topics**: Basic Programming, String Manipulation  
    **Description**: Write a program to count vowels and consonants in a given string.  
    **Example**:  
    Input: `string = "hello world"`  
    Output: `Vowels: 3, Consonants: 7`  
    Explanation: "hello world" contains 3 vowels (e, o, o) and 7 consonants (h, l, l, w, r, l, d).  
 */

 
 import java.util.Scanner;

public class P12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scanner.nextLine();
        int n = s.length();
        int vowels= 0 , consonents = 0;
        for(int i=0; i<n; i++){
            if(('a'==s.charAt(i)) || ('e'==s.charAt(i)) || ('i'==s.charAt(i)) || ('o'==s.charAt(i)) || ('u'==s.charAt(i)) || ('A'==s.charAt(i)) || ('E'==s.charAt(i)) || ('I'==s.charAt(i)) || ('O'==s.charAt(i)) || ('U'==s.charAt(i))){
                vowels++;
            }else if(s.charAt(i)!= ' '){
                consonents++;
            }
        }

        System.out.println("Vowels: "+vowels + " Consonents: "+ consonents);

        scanner.close();
    }
}
