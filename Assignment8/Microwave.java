import java.util.Scanner;
public class Microwave {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter Cook Time: ");
        int cookTime = scan.nextInt();
        
        System.out.println("Enter number of items for heating");
        int itemCount = scan.nextInt();
        
        if (itemCount == 1) {
        System.out.println("We reccemend: " + cookTime);
        
        
   } 
   if (itemCount == 2) {
       cookTime = cookTime * 2;     
       System.out.println("We reccemend %50 minute safety limit when cooking two items");
            
    }
   
  if itemCount == 3) {
        System.out.println("We reccemend % minutes
  } 
 }
} 
  