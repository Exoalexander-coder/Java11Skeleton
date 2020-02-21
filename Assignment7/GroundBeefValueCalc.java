import java.util.Scanner;
public class GroundBeefValueCalc {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        
        
        System.out.println("Enter the price per pound of package A: ");
        double PricePerPoundA = scan.nextDouble();
        
        
        System.out.println("Enter the precent of lean package A: ");
        int precentLeanA = scan.nextInt();
        
        System.out.println("Enter the Price per pound for package B: ");
        float pricePerPoundB = scan.nextFloat();
        
        System.out.println("Enter the Precent of lean package B: ");
        int precentLeanPackageB = scan.nextInt();
        
        
        double pricePerPoundLeanB = (pricePerPoundB * 100) / precentLeanPackageB;
        double pricePerPoundLeanA = (PricePerPoundA * 100) / precentLeanA;
        
        if (pricePerPoundLeanB < pricePerPoundLeanA) {
         System.out.println("We reccomend package pound B");   
            
        
        }
           
       else {
        System.out.println("We reccemend package A");
      } 
  
  }
  
}  
  
 