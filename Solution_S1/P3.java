// 3. **Validating Leap Years**  
//    **Difficulty**: Easy  
//    **Topics**: Basic Programming, Date Handling  
//    **Description**: Write a program to check if a given year is a leap year.  
//    **Example**:  
//    Input: `year = 2020`  
//    Output: `Leap Year`  
//    Explanation: 2020 is divisible by 4 but not by 100, or it is divisible by 400, so it is a leap year.  



import java.util.Scanner;;
public class P3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        if((year%4==0 && year%100!=0) || year%400==0){
            System.out.print(year+" is leap year");
        }else{
            System.out.print(year+" is not a leap year");
        }
        scanner.close();
    }
}
