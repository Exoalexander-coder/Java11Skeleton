import java.util.Scanner;

  public class AnnualApplianceCost {
        public static void main(String[] args) {
             Scanner scan = new Scanner(System.in);
      
      
      double costPerKwh;
      int yearlyKwhUsed;
      double annualCost;
      
      
      System.out.println("Enter cost per kilowatt-hours in cents:  ");
      costPerKwh = scan.nextDouble();
      System.out.println("Enter kilowatt-hours used per year:   ");
      yearlyKwhUsed = scan.nextInt();
      annualCost = costPerKwh * yearlyKwhUsed;
      System.out.println ("Annual Cost: " + annualCost);
    
    }
 
}
    
    
  
    