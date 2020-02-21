import java.util.Scanner; //imports scanner to scan code

public class integerAdding { //declares name of program
    public static void main(String[] args) { // ellows execution of program
        Scanner scan = new Scanner(System.in); //scans code for running
        System.out.println("How many numbers will be added up:  "); //prints line
        int sum = 0; //declares loop integer
        int numAmount = scan.nextInt(); //declares variable and scans line
        int count = 0; //declares amount of loops
        while (count < numAmount ) { // starts programming loops
        System.out.println("Enter an Integer: "); // prints line
        sum += scan.nextInt(); // executes user inputs
       
        
        count++; //adds more loops
        
    }
    System.out.println(sum); // prevents program from looking messy
  }
  
}