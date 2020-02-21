import java.util.Scanner;

class OrderChecker {
     public static void main(String[] args) {
         System.out.println("Number of bolts:  ");
           Scanner scan = new Scanner(System.in);
         
              int bolts;
              int nuts;
              int washers;
         
         final int boltPrice = 5;
         final int nutPrice = 3;
         final int washerPrice = 4;
         
         
         System.out.println("Number of bolts");
         bolts = scan.nextInt();
         System.out.println("Number of nuts");
         nuts = scan.nextInt();
         System.out.println("Number of washers");
         washers = scan.nextInt();
         
         if (nuts < bolts) {
             System.out.println("Check the Order: too few nuts");
             
            }
            
            if (washers * 2 < bolts) {
                System.out.println("Check the Order: too few washers");
            }     
          
             int totalCost = bolts * boltPrice + washers * washerPrice + nuts * nutPrice;
             
         System.out.println("Total Cost:  " + totalCost);
         
         
         
        
         
         
         
         
         
         
                 
        
       
        
     }

}        