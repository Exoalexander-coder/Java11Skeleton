import java.util.Scanner; 

public class integerAverage { 
    public static void main(String[] args) { 
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers will be added: ");
         int numAmount = scan.nextInt();
         float sum = 0;
         float average = 0;
         int count = 0;
         while ( count < numAmount) {
             System.out.println("Enter a Number: ");
             sum += scan.nextInt();
             
             count++;
         
        
        
      }
      average = sum/numAmount;
      System.out.println(average);
      
   } 
} 
        
        
            
        