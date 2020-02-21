import java.util.Scanner; 

public class EnergyMeter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
       
        System.out.println("Press any number too continue");
        int NumberKeys = scan.nextInt();
        int sum = 0;
        System.out.println();
    
        while (NumberKeys > 0) {
        System.out.println("Enter Energy Readings: ");
        int ReadingValue = scan.nextInt();
        System.out.println();
        
        System.out.println("Enter Dark Matter Readings: ");
        int DarkMatterValue = scan.nextInt();
        System.out.println();
        
        if (ReadingValue == DarkMatterValue) {
            System.out.println("readings balanced");
            System.out.println();
            
        } else {
            System.out.println("WARNING: readings unbalanced");
        
        
        
      } 
   } 
 }
} 