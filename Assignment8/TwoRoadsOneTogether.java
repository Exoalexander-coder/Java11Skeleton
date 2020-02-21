import java.util.Scanner; // imports scanner

public class TwoRoadsOneTogether {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       
        System.out.println("Press any number to start program");
        int BeginLoop = scan.nextInt();
        int loop;
        int sum = 0;
        while (BeginLoop > 0) {
        System.out.println("Enter integer: "); // prints text
        int Road1 = scan.nextInt(); //asks for input for user
        
        System.out.println("Enter Second integer: ");
        int Road2 = scan.nextInt();
        
        if (Road1 == Road2) { // if first integer is equal to second integer then print balanced Integer
            System.out.println("balanced Integer");
            
        } else { // if first intger is not equal to second integer then print unbalanced integer
            System.out.println("Unbalanced Integer");
            
        
      }
    } 
  } 
}  