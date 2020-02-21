import java.util.Scanner;

public class DiscountPrices {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        double purchases;
        double DiscountedPrices;
        
        System.out.println ("Enter amount of purchases:  "); 
        purchases = scan.nextDouble();
        
        if (purchases > 1000)  {
            DiscountedPrices = purchases - (purchases *0.1);
            System.out.println("Discounted Price:   " + DiscountedPrices);
        } else {
            System.out.println("No discount applied");
           
            
        
        
    
    
       }
    }   
} 