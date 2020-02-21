import java.util.Scanner; //imports scanner

public class name { // gives name to program
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //begins scanning code letter by letter
        
        System.out.println("Press any Number to begin identity test"); // prints line
        int BeginTest = scan.nextInt(); // asks user for input
        
        int sum = 0;
        
        while (BeginTest > 0) { // begins loop
        System.out.println("What is my name: ");
        String identity = scan.nextLine();
        System.out.println("My name is: " + identity);
        
  } 
 } 
}
  
   