import java.util.Scanner;
public class Salary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Press any number to begin");
        int begin = scan.nextInt();
        int sum = 0;
        
        
        
        while (begin > 0) {
        System.out.println("Enter your Monthly income: ");
        int income = scan.nextInt();
        
        if (income >= 4000) {
            System.out.println("Your approved for a 20K loan");
            
            
        } else if (income > 2000 && income < 4000) {
            System.out.println("Your Approved for a 5K loan");
            
            
        } else {
            System.out.println("Your not approved for any loan");
           
        
      }
    }
  } 
}   