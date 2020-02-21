import java.util.Scanner; 

public class AlternateUniverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Press any number too begin");
        int QuantumnLoop1 = scan.nextInt();
        int sum = 0;
        while (QuantumnLoop1 > 0) {
            
        
        System.out.println("Enter first number: ");
        int Quantumn2 = scan.nextInt();
        
        System.out.println("Enter Second number: ");
        int Quantumn3 = scan.nextInt();
        
        if (Quantumn2 > Quantumn3) {
            System.out.println("You live in a world we're germany won WW2");
            System.out.println("choose a number greater than 1 to live in america press a number less then 1 to live in europe: ");
            int AxisCountry1 = scan.nextInt();
            
            System.out.println("Choose another number: ");
            int AxisCountry2 = scan.nextInt();
            
            if (AxisCountry1 > AxisCountry2) {
            
            System.out.println("You live in Vanouver of the Japanese Pacific States of America");
            
        } else {
            System.out.println("You live in the Germanian capital of berlin");
            
            } 
            
        } else {
            System.out.println("You live in a world we're the allies won WW2");
            System.out.println("if you wish to live in america chosee a number equal to the second one, if you choose to live in europe choose a number not equal to itself: ");
            int AlliedCountry1 = scan.nextInt();
            System.out.println("Choose a second number: ");
            int AlliedCountry2 = scan.nextInt();
            
            if (AlliedCountry1 == AlliedCountry2) {
                System.out.println("You live in the USA to choose a state press a number less then 10: ");
                int State1 = scan.nextInt();
                System.out.println("Choose another number: ");
                int State2 = scan.nextInt();
                if (State1 < State2) {
                    System.out.println("You live in Alabama");
                    
                    
                } else {
                    System.out.println("You live in Conneticut");
                
            
    
    
          }
        } else {
            System.out.println("You live in Europe");
            
          }  
        }  
      } 
  }
}   