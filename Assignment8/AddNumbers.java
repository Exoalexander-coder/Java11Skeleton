import java.util.Scanner;
   class AddNumbers {
      public static void main(String args[]) {
       Scanner scan = new Scanner(System.in);
     
      
         System.out.println("Enter any number to begin");
         int begin = scan.nextInt();
         int sum = 0;
       
       while(begin > 0) {
        int x, y, z;

       System.out.println("Enter two integers to calculate their sum: ");
       Scanner in = new Scanner(System.in);
     
       x = in.nextInt();
       y = in.nextInt();
       z = x + y;
      
       System.out.println("Sum of the integers = " + z);
    }
  }
}  

   
        
