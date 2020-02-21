import java.util.Scanner;
class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
          
        System.out.println("Enter the number which you need is factoial: ");
        int numberInput = scan.nextInt();
        int f = 1;
        
        while (numberInput > 0) {
            f *= numberInput;
            numberInput--;
        
       
        
        }
        System.out.println("your factorial value is: "+ f);
        
    } 
}  