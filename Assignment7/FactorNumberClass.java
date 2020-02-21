import java.util.Scanner;
class FactorNumberClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter Value for first Number: ");
        int FirstNumber = scan.nextInt();
        
        System.out.println("Enter Value for Second Number: ");
        int SecondNumber = scan.nextInt();
        
        if (FirstNumber % SecondNumber == 0) {
            System.out.println("First number is divisible by Second Number");
            
            
            
        } else{
            System.out.println("First number is not divisible by the second number");
        
        
        
      }
   } 
}  