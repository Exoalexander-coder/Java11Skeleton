import java.util.Scanner;
public class CombinedDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Press any number key to begin program");
        
        int AppCompletion1 = scan.nextInt();
        int AppCompletion2;
        int sum = 0;
        
        while (AppCompletion1 > 0) {
        
        System.out.println("Enter first digit: ");
        int FirstDigit = scan.nextInt();
        
        System.out.println("Enter Second digit: ");
        int SecondDigit = scan.nextInt();
        
        System.out.println("The Combined Digit is: " + FirstDigit + SecondDigit);
        
    }
  } 
}   