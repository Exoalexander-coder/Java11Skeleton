import java.util.Scanner;
public class FlatEarth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("This program combines 1 and 2 forward and 1 and 2 reversed which ever is dominate will print out two diffrent results");
        System.out.println();
        
        System.out.println("To see negative response press 2 and 1 in both inputs");
        System.out.println();
        
        System.out.println("To see positive response press 1 and 2 for negative response");
        System.out.println();
        
        System.out.println("The greater number: 2 to 10 means you think the Earth is flat");
        System.out.println();
        
        System.out.println("The lesser number being: 1 or 0 means you don't think the earth is flat");
        
        System.out.println("press 2 if you think earth is flat if not press 1 or 0: ");
        int FlatEarthTrue = scan.nextInt();
        System.out.println();
        
        System.out.println("press 1 if you think the earth round if not press 2 or anything greater than 2: ");
        int FlatEarthFalse = scan.nextInt();
        System.out.println();
        
        if (FlatEarthTrue < FlatEarthFalse) {
            System.out.println("YEAH YOUR NOT STUPDID");
            System.out.println();
            
        } else {
            System.out.println("YOU BE VERY STUPID THE EARTH IS A SPHERE");
            System.out.println();
        
    
           
    
            
      
    } 
  } 
}   