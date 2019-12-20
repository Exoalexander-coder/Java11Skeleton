import java.util.Scanner;

  public class BrickDrop {
        public static void main(String[] args) {
              Scanner scan = new Scanner(System.in);
              
              System.out.println("Enter the number of seconds:  ");
              
              double seconds;
              double Distance;
              double g = 32.174;
              
              seconds = scan.nextDouble();
              Distance = (1f/2f) * g * seconds * seconds;
              System.out.println("Distance:  " + Distance);
              
              
              
              
      
      
    
    }
 
}
    