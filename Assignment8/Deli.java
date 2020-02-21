import java.util.Scanner;
public class Deli {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Press any Number to continue");
        int Begin = scan.nextInt();
        int itemPrice;
        boolean expressDelivery;
        int sum = 0;
        
        
        while (Begin > 0) {
        System.out.println("Enter item:   ");
        String item = scan.nextLine();
        
        
         
        System.out.println(" Enter the price:  ");
        itemPrice = scan.nextInt();
        
        System.out.println("Overnight delivery (0==no, 1==yes): ");
        int Overnight = scan.nextInt();
        
        System.out.println("invoice:  ");
         
    }
  }  
}  